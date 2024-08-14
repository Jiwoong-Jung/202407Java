<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="mvjsp.chap17.board.service.WriteArticleService" %>
<%@ page import="mvjsp.chap17.board.model.Article" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("euc-kr"); %>
<jsp:useBean id="writingRequest" 
	class="mvjsp.chap17.board.service.WritingRequest" />
<jsp:setProperty name="writingRequest" property="*" />
<%
	Article postedArticle = 
		WriteArticleService.getInstance().write(writingRequest);
	request.setAttribute("postedArticle", postedArticle);
%>
<html>
<head><title>�Խñ� �ۼ�</title></head>
<body>
�Խñ��� ����߽��ϴ�.
<br/>
<a href="<c:url value='/list.jsp'/>">��Ϻ���</a>
<a href="<c:url value='/read.jsp?articleId=${postedArticle.id}'/>">�Խñ� �б�</a>
</body>
</html>
