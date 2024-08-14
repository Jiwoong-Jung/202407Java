<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="exceptionType" value="${updateException.getClass().simpleName}" />
<html>
<head><title>수정 실패</title></head>
<body>
에러: 
<c:choose>
	<c:when test="${exceptionType == 'ArticleNotFoundException'}">
	수정할 게시글이 존재하지 않습니다.
	</c:when>
	<c:when test="${exceptionType == 'InvalidPasswordException'}">
	암호를 잘못 입력하셨습니다.
	</c:when>
</c:choose>
<br/>
<a href="list.jsp?p=${param.p}">목록보기</a>
</body>
</html>
