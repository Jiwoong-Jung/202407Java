<%@ page contentType="text/html; charset=euc-kr" %>
<%@page import="mvjsp.chap17.board.service.ReadArticleService"%>
<%@page import="mvjsp.chap17.board.service.ArticleNotFoundException"%>
<%@page import="mvjsp.chap17.board.model.Article"%>
<%
	int articleId = Integer.parseInt(request.getParameter("articleId"));
	String viewPage = null;
	try {
		Article article = ReadArticleService.getInsteance().readArticle(articleId);
		request.setAttribute("article", article);
		viewPage = "/read_view.jsp";
	} catch(ArticleNotFoundException ex) {
		viewPage = "/article_not_found.jsp";
	}
%>
<jsp:forward page="<%= viewPage %>" />