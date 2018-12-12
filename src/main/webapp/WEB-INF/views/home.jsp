<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<P>The time on the server is ${serverTime}.</P>
	<a href="./notice/noticeList">noticeList</a>
	<!-- ?curPage=1 -->
	<a href="./qna/qnaList">qnaList</a>

	<c:choose>
		<c:when test=" ${not empty member}"><
			<p>
				<a href="./member/logOut">logout</a> <a href="./member/myPage">myPage</a>
			</p>
		</c:when>
		
		<c:otherwise>
			<p>
				<a href="./member/join">join</a> <a href="./member/login">login</a>
			</p>
		</c:otherwise>
	</c:choose>
</body>
</html>
