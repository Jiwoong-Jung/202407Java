<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>�۾���</title></head>
<body>

<form action="<c:url value='/write.jsp' />" method="post">
����: <input type="text" name="title" size="20"/> <br/>
�ۼ���: <input type="text" name="writerName" /> <br/>
�۾�ȣ: <input type="password" name="password" /> <br/>
�۳���: <br/>
<textarea name="content" cols="40" rows="5"></textarea>
<br/>
<input type="submit" value="����" />
</form>

</body>