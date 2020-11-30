<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
<%
String msg=(String)request.getAttribute("msg");
String url=(String)request.getAttribute("url");
%>
alert('<%=msg%>')
document.location.href='<%=url%>'
</script>