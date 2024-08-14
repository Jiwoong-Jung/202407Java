<%@ page contentType="text/html; charset=euc-kr" %>
<html>
<head><title>수정하기</title></head>
<body>

<form action="update.jsp" method="post">
<input type="hidden" name="articleId" value="${article.id}" />
<input type="hidden" name="p" value="${param.p}" />
제목: <input type="text" name="title" size="20" value="${article.title}" /> <br/>
글암호: <input type="password" name="password" /> <br/>
글내용: <br/>
<textarea name="content" cols="40" rows="5">${article.content}</textarea>
<br/>
<input type="submit" value="수정" />
</form>

</body>