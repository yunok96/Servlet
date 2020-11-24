<%@page import="memo.Memo"%>
<%@page import="java.util.List"%>
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
List<Memo> memoList = (List)request.getSession().getAttribute("memoList");
%>
<h1>메모 리스트</h1>
<table>
<tr>
<th>번호</th>
<th>내용</th>
<th>시간</th>
</tr>
<%
if(memoList!=null){
for(int i = 0; i<memoList.size(); i++){
	Memo memo = memoList.get(i);
	%>
	<tr>
	<td><%=memo.getSeq() %></td>
	<td><%=memo.getContent() %></td>
	<td><%=memo.getTime() %></td>
	</tr>
	<%
}
} else{
	%>
	<tr>
	<td colspan="3">저장된 메모가 없습니다.</td>
	</tr>
	<%
}
%>
</table>
</body>
</html>