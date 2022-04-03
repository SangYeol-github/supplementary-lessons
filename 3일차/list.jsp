<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>게시판 목록 보기</title>
</head>
<body>
	<h3>게시판 목록보기</h3>
	<c:forEach var = "b" items = "${list }">
		
		<div>${b.num } <a href="/bbs/detail?num=${b.num}" >${b.title }</a> ${b.bdate }
		 	<c:forEach var = "a" items = "${b.attach }">
		 	${a.filename } ${a.filesize }
		 	</c:forEach>
		 </div>         	
      	
	</c:forEach>
</body>
</html>