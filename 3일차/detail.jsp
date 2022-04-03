<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>사용자정보 상세보기</title>
	<style type="text/css">
		main div { width:fit-content; padding:10px; border-bottom: 1px solid black; }
		main div>label {display:inline-block; width:60px; text-align: right; margin:0 10px; }
		a { text-decoration: none; }
	</style>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	<script>
	
	function del_board(num){
		
		if(!confirm('정말 삭제 하시겠습니까?')){
	         return;
	      }
	      
	      var obj = {};
	      obj.num = num;
	      /* alert(obj.uid); */
	      
	      $.ajax({
	         url : '/bbs/delete',
	         method : 'post',
	         cache : false,
	         data : obj,
	         dataType : 'json',
	         success : function(res){
	            alert(res.deleted ? '삭제 성공' : '삭제 실패!');
	            location.href = '/bbs/list';
	         },
	         error : function(xhr, status, err){
	            alert('에러 : ' + err);
	         }
	      });

	}
	</script>
</head>
<body>
	<main>
 	
	<h3>게시판정보 상세보기</h3>
		<div><label>글 번호 :</label>${bbs.num }</div>
		<div><label>제 목 : </label>${bbs.title }</div>
		<div><label>작성자 : </label>${bbs.author }</div>
		<div><label>내 용 : </label>${bbs.contents }</div>
		<div><label>작성일 : </label>${bbs.bdate }</div>
		<div>
		<div>첨부파일</div>
			<c:forEach var="f" items="${bbs.attach}">
		<div>${f.num}.
			<a href="/bbs/file/download/${f.num}">${f.filename}</a>(${f.filesize}) </div>
			</c:forEach>
		</div>
		<p>
		<div>
		[<a href = "/bbs/edit?num=${bbs.num }">수정</a>]
		[<a href = "javascript:del_board('${bbs.num }');">삭제</a>]
		<button type = "button" onclick = "del_board('${bbs.num }');">삭제</button>
		<button type="button" 
					onclick="location.href='/bbs/list';">목록</button>
		</div>
 	
	</main>	
</body>
</html>