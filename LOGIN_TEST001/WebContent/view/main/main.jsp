<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<%=session.getAttribute("userId") %>님 로그인중<br>
			<input type="button" id="btnLogout" value="로그아웃">
		</div>
		<div>
			<h1>This is main page.</h1>
		</div>
		<script>
			document.getElementById('btnLogout').addEventListener('click',function(){
				document.location.href = '/LOGIN_TEST001/member/logout.samsung';
			});
		</script>
	</body>
</html>