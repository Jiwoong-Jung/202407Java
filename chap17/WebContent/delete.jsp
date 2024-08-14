<%@ page contentType="text/html; charset=euc-kr" %>
<% request.setCharacterEncoding("euc-kr"); %>
<%@page import="mvjsp.chap17.board.service.DeleteArticleService"%>
<jsp:useBean id="deleteRequest" 
	class="mvjsp.chap17.board.service.DeleteRequest" />
<jsp:setProperty name="deleteRequest" property="*" />
<%
	String viewPage = null;
	try {
		DeleteArticleService.getInstance().deleteArticle(deleteRequest);
		viewPage = "/delete_success.jsp";
	} catch (Exception ex) {
		request.setAttribute("deleteException", ex);
		viewPage = "/delete_error.jsp";
	}
%>
<jsp:forward page="<%= viewPage %>" />
