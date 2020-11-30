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
				<tr>
					<th>seq</th>
					<th>title</th>
					<th>create</th>
				</tr>
				<c:forEach var="board" items="${requestScope.boardList }">
					<tr>
						<td>${board.seq }</td>
						<td><a href="/BOARD_TEST001/board/boardDetail.samsung?seq=${board.seq}">${board.title }</a></td>
						<td>${board.create_date }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div>
			<c:forEach var="pageNo" begin="1" end="${requestScope.pageCnt }" >
				<span>${pageNo }</span>
			</c:forEach>
		</div>
	</body>
</html>