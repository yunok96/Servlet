<%@page import="lotto.Lotto"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>운빨좆망겜</h1>

<%
Set<Integer> set = new Lotto().makeLotto();
application.setAttribute("set", set);
%>
<%
for(Integer i : set){
	%><%= i %><br><%
}
String[] input = request.getParameterValues("nums");
int correct = 0;
for(int i = 0; i<6; i++){
	if(set.contains(Integer.parseInt(input[i]))){
		correct++;
	}
}
%><br>
맞춘 개수 <%= correct %>

<a href='/FORTEST/input.lotto'>돌아가기</a>
</body>
</html>