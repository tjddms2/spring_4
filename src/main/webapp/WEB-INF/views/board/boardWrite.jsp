<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${board} WRITE</h1>
	<!-- 현재폴더는 qna,notice -->
	
	<form action="./${board}Write" method="Post">
	<input type="text" name="title">	
	<input type="text" name="writer">
	<textarea rows="" cols="" name="contents"></textarea>
	<button>WRITER</button>
	</form>

</body>
</html>