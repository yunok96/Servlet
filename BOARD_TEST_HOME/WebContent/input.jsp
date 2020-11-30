<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 화면</title>
</head>
<body>
<h1>입력 화면</h1>
<form action="/BOARD_TEST_HOME/insert.home" method="post">
<input type="text" name="title" placeholder="제목 입력">
<input type="text" name="content" placeholder="내용 입력">
<input type="submit" value="저장">
</form>
</body>
</html>