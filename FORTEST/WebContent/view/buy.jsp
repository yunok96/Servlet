<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<form action='/FORTEST/view/calc.sbak'>
<input type='radio' name='where' value='가게'>가게
<input type='radio' name='where' value='테이크아웃'>테이크아웃<br>
<input type='radio' name='temp' value='차갑게'>차갑게
<input type='radio' name='temp' value='따뜻하게'>따뜻하게<br>
아이스커피 (1500) <input type='number' name='Coffee' min='0' value='0'> |
카페라떼 (2000) <input type='number' name='Coffee' min='0' value='0'> |
콜드브루 (2500) <input type='number' name='Coffee' min='0' value='0'>
<br>
민트티 (3000) <input type='number' name='Coffee' min='0' value='0'> |
라임티 (3000) <input type='number' name='Coffee' min='0' value='0'> |
얼그레이티 (4000) <input type='number' name='Coffee' min='0' value='0'> |
유자티 (3500) <input type='number' name='Coffee' min='0' value='0'>
<br>
<input type='radio' name='pay' value='현금'>현금
<input type='radio' name='pay' value='카드'>카드<br>
<input type='submit' value='확인'>
</form>

<script>

</script>
</body>
</html>