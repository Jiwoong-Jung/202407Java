<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="exceptionType" value="${updateException.getClass().simpleName}" />
<html>
<head><title>���� ����</title></head>
<body>
����: 
<c:choose>
	<c:when test="${exceptionType == 'ArticleNotFoundException'}">
	������ �Խñ��� �������� �ʽ��ϴ�.
	</c:when>
	<c:when test="${exceptionType == 'InvalidPasswordException'}">
	��ȣ�� �߸� �Է��ϼ̽��ϴ�.
	</c:when>
</c:choose>
<br/>
<a href="list.jsp?p=${param.p}">��Ϻ���</a>
</body>
</html>
