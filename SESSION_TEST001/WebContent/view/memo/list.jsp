<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Memo" %>
<%
	List<Memo> memoList = (List)request.getSession().getAttribute("memoList");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			.table1 {
				border:1px;
				border-style: solid;
			}
		</style>
	</head>
	<body>
		<div>
			<table class="table1">
				<tr>
					<th>seq</th>
					<th>content</th>
					<th>creat_date</th>
				</tr>
				<%
					if(null != memoList){
						for(int i=0;i<memoList.size();i++){
							Memo memo = memoList.get(i);
				%>
				<tr>
					<td><%=memo.getSeq() %></td>
					<td><%=memo.getContent() %></td>
					<td><%=memo.getCreate_date() %></td>
				</tr>
				<%
						}
					} else {
				%>
					<tr>
						<td colspan="3">저장된 메모가 없습니다.</td>
					</tr>
				<%
					}
				%>
			</table>
		</div>
	</body>
</html>