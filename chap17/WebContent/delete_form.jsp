<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>�����ϱ�</title></head>
<body>

<form action="<c:url value='/delete.jsp' />" method="post">
<input type="hidden" name="articleId" value="${param.articleId}" />
�۾�ȣ: <input type="password" name="password" /> <br/>
<input type="submit" value="����" />
</form>

</body>
</html>