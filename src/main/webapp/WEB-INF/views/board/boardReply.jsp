<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${board}Reply</h1>

<form action="./${board}Update" method="Post">
<input type="hidden" name="num" value="${num}">
	Title : <input type="text" name="title">
	writer : <input type="text" name="writer">
	Contents : <textarea  name="Contents" rows="" cols=""></textarea>
	<button>Reply</button>
</form>
</body>
</html>