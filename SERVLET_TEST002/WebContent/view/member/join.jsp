<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getAttribute("cp") %>/member/insert.samsung">
	<input type='hidden' name='hi' value='insert'>
	<input type='text' name='user_id' placeholder="아이디">
	<input type='submit' value='회원가입'>
</form>

</body>
</html>