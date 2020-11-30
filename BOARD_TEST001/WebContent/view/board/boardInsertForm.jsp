<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="/BOARD_TEST001/board/insertBoard.samsung" method="post">
			<input type="text" name="title" placeholder="제목">
			<input type="text" name="content" placeholder="내용">
			<input type="submit" value="작성">
		</form>
	</body>
</html>