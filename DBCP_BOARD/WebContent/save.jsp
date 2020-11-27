<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String title = request.getParameter("title");
String content = request.getParameter("content");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
PreparedStatement pstmt = null;

try{
	String jdbcDriver = "jdbc:apache:commons:dbcp:";
	String id = "root";
	String pw = "1234";
	
	conn = DriverManager.getConnection(jdbcDriver, id, pw);
	pstmt = conn.prepareStatement("INSERT INTO board VALUES (?, ?)");
	pstmt.setString(1, title);
	pstmt.setString(2, content);
	pstmt.executeUpdate();
} finally{
	if(pstmt!=null) try{
		pstmt.close();
	} catch(SQLException e) { }
	if(conn!=null) try{
		conn.close();
	} catch(SQLException e) { }
}

%>
<h1>입력 내용이 성공적으로 저장되었습니다</h1>
<form action="/DBCP_BOARD/insert.board">
<input type="submit" value="입력으로 돌아가기">
</form>
<form action="/DBCP_BOARD/view.board">
<input type="submit" value="게시판 내용 조회">
</form>
</body>
</html>