<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("message");
	String url = (String)request.getAttribute("url");
%>
<script>
	alert('<%=msg%>');
	document.location.href = '<%=url%>';
</script>