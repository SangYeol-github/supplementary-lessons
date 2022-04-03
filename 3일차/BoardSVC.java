package com.tjoeun.svc;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tjoeun.dao.BoardDAO;
import com.tjoeun.vo.AttachVO;
import com.tjoeun.vo.BoardVO;

@Service
public class BoardSVC {
	
	@Autowired
	private BoardDAO dao;
	
	public boolean addBoard(BoardVO board) {
		
		return dao.addBoard(board);
	}
	
	 public boolean addBoard(HttpServletRequest request, BoardVO board, MultipartFile[] mfiles) {
	      boolean saved = addBoard(board); // 글 저장
	      int board_num = board.getNum();  // 글 저장시 자동증가 필드
	      if (!saved) {
	         System.out.println("글 저장 실패");
	         return false;
	      }
	      
	      ServletContext context = request.getServletContext();
	      String savePath = context.getRealPath("/WEB-INF/upload");
	      int fileCnt = mfiles.length;
	      int saveCnt = 0;
	      try {
	         for(int i=0;i<mfiles.length;i++) {
	            String filename = mfiles[i].getOriginalFilename();
	            mfiles[i].transferTo( new File(savePath+"/"+filename)); //서버측 디스크
	            Map<String,Object> map = new HashMap<>();
	            map.put("board_num", board_num);
	            map.put("filename", filename);
	            map.put("filesize", mfiles[i].getSize());
	            boolean fSaved = dao.addFileInfo(map); // attach 테이블에 파일정보 저장
	            if(fSaved) saveCnt++;
	         }
	         return fileCnt==saveCnt ? true : false;
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	      
	      return false;
	   }
	 
	 public List<BoardVO> boardList() {
			List<Map<String,Object>> list = dao.boardList();
			List<BoardVO> list2 = new ArrayList<>();
			
			int prev_num = 0;
			for(int i=0;i<list.size();i++) {
				int bnum = (int)list.get(i).get("num");
				if(bnum==prev_num) { // 첨부파일이 다수개라서 중복되는 행이 있다면...
					BoardVO _board = list2.get(list2.size()-1);
					AttachVO att = new AttachVO();
					att.setFilename((String)list.get(i).get("filename"));
					att.setFilesize ((int)list.get(i).get("filesize"));
					_board.attach.add(att);
					continue;
				}
				
				// 첨부파일이 없거나 한개인 게시글이라면...
				Map<String, Object> m = list.get(i);
				BoardVO board = new BoardVO();
				board.setNum(bnum);
				board.setTitle((String)m.get("title"));
				board.setAuthor((String) m.get("author"));

				if(m.get("filename")!=null) { // 첨부파일을 가진 글이라면...
				
					AttachVO att = new AttachVO();
					att.setFilename((String)list.get(i).get("filename"));
					att.setFilesize ((int)list.get(i).get("filesize"));
					board.attach.add(att);
				}
				list2.add(board);
				prev_num = bnum;  // 중복되는 행인지 확인하기 위함
			} // end of for()
			return list2;
		}
	
	

	 public BoardVO detail(int num) {

			List<Map<String,Object>> list = dao.detail(num);
			BoardVO board = new BoardVO();
			int size = list.size();
			for(int i=0;i<size;i++) {
				Map<String,Object> map = list.get(i);
				if(i==0) {
					board.setNum( (int)map.get("num"));
					board.setTitle( (String)map.get("title"));
					board.setAuthor( (String)map.get("author"));
					board.setContents ( (String)map.get("contents"));
				}
				Object obj = map.get("filename");
				if(obj!=null) {
					AttachVO att = new AttachVO();
					att.setNum( (int)map.get("att_num"));
					att.setFilename((String)map.get("filename"));
					att.setFilesize((int)map.get("filesize"));
					board.attach.add(att);
				}
			}
			return board;
		}

		public String getFilename(int num) {
			return dao.getFilename(num);
		}

	public int delete(BoardVO board) {
		
		return dao.delete(board);
	}

	
	
	
	
}
