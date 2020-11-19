<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<%
String[] amount = request.getParameterValues("Coffee");
int howmuch = 1500*Integer.parseInt(amount[0]) + 2000*Integer.parseInt(amount[1]) + 2500*Integer.parseInt(amount[2]) + 3000*Integer.parseInt(amount[3]) + 3000*Integer.parseInt(amount[4]) + 4000*Integer.parseInt(amount[5]) + 3500*Integer.parseInt(amount[6]);
String where = request.getParameter("where");
%>
<%=request.getParameter("where") %> 에서<br>
온도는<%=request.getParameter("temp") %><br>
총 가격은 <%=howmuch %>
<%=request.getParameter("pay") %>으로 결제<br>
</body>
</html>