<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>게시판 글 쓰기</title>
</head>
<body>
<h3>게시판 글 쓰기</h3>
<form action="/bbs/add" method="post" enctype="multipart/form-data">
	<div><label for="author">작성자</label><input type="text" name="author" value="관리자"></div>
	<div><label for="title">제 목</label><input type="text" name="title" value="게시판 테스트"></div>
	<div><label for="contents">내 용</label><textarea name="contents" cols="40" rows="5"></textarea></div>
	<div><label>첨부파일</label><input type="file" name="files" multiple></div>
	<div>
		<button type="submit">저장</button>
		<button type="reset">취소</button>
	</div>
</form>
</body>
</html>