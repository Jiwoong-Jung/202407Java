<%@ page contentType="text/html; charset=euc-kr" %>
<html>
<head><title>�����ϱ�</title></head>
<body>

<form action="update.jsp" method="post">
<input type="hidden" name="articleId" value="${article.id}" />
<input type="hidden" name="p" value="${param.p}" />
����: <input type="text" name="title" size="20" value="${article.title}" /> <br/>
�۾�ȣ: <input type="password" name="password" /> <br/>
�۳���: <br/>
<textarea name="content" cols="40" rows="5">${article.content}</textarea>
<br/>
<input type="submit" value="����" />
</form>

</body>