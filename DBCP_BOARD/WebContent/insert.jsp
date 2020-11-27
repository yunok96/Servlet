<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판 내용 입력 화면</h1>
<form action="/DBCP_BOARD/save.board">
<input type="text" name="title" placeholder="제목을 입력">
<input type="text" name="content" placeholder="내용을 입력">
<input type="submit" value="저장">
</form>
</body>
</html>