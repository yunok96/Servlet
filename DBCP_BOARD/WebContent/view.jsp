<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판 내용 조회 화면</h1>
<table>
<tr>
<th>제목</th><th>내용</th>
</tr>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
try{
	String jdbcDriver = "jdbc:mysql://localhost:3306/MYOWN?useUnicode=true&characterEncoding=utf8";
	String id = "root";
	String pw = "1234";
	String query = "SELECT * FROM MYOWN.BOARD";
	conn = DriverManager.getConnection(jdbcDriver, id, pw);
	stmt = conn.createStatement();
	rs = stmt.executeQuery(query);
	while(rs.next()){
		%>
		<tr>
		<td><%=rs.getString("TITLE")%></td>
		<td><%=rs.getString("CONTENT")%></td>
		</tr>
		<%	
	}
} catch(SQLException e){
	out.println(e.getMessage());
	e.printStackTrace();
} finally{
	if(rs!=null) try {
		rs.close();
	} catch(SQLException e) { }
	if(stmt!=null) try {
		stmt.close();
	} catch(SQLException e) { }
	if(conn!=null) try {
		conn.close();
	} catch(SQLException e) { }
}
%>
</table>
<form action="/DBCP_BOARD/insert.board">
<input type="submit" value="입력으로 돌아가기">
</form>
</body>
</html>