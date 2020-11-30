<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Board List</h1>
		<div>
			<table>
				<c:forEach var="board" items="${requestScope.boardList }">
					<tr>
						<td>seq</td>
						<td>${board.seq }</td>
					</tr>
					<tr>
						<td>title</td>
						<td>${board.title }</td>
					</tr>
					<tr>
						<td>content</td>
						<td>${board.content }</td>
					</tr>
					<tr>
						<td>create_date</td>
						<td>${board.create_date }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>