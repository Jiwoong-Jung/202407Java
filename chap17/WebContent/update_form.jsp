<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="mvjsp.chap17.board.service.ReadArticleService" %>
<%@ page import="mvjsp.chap17.board.model.Article" %>
<%@ page import="mvjsp.chap17.board.service.ArticleNotFoundException" %>
<%
	String viewPage = null;
	try {
		int articleId = Integer.parseInt(request.getParameter("articleId"));
		Article article = ReadArticleService.getInsteance().getArticle(articleId);
		viewPage = "/update_form_view.jsp";
		request.setAttribute("article", article);
	} catch (ArticleNotFoundException ex) {
		viewPage = "/article_not_found.jsp";
	}
%>
<jsp:forward page="<%= viewPage %>" />
