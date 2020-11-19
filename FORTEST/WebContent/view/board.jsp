<%@page import="board.BoardService"%>
<%@page import="board.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>안녕 안녕 안녕</h1>
<table>
<tr><th>번호</th><th>제목</th><th>내용</th><th>글쓴이</th></tr>
<% List<Board> li = new BoardService().makeBoard();  %>
<% for(Board b : li){
	
	%>
	<tr><td>
	<%=b.getSeq() %>
	</td>
	<td>
	<%=b.getTle() %>
	</td>
	<td>
	<%=b.getComm() %>
	</td>
	<td>
	<%=b.getWrt() %>
	</td></tr>
	<%
}
%>
</table>

</body>
</html>