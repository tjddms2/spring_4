<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<P>  The time on the server is ${serverTime}. </P>
	<a href="./notice/noticeList">noticeList</a><!-- ?curPage=1 -->
	<a href="./qna/qnaList">qnaList</a>
</body>
</html>
