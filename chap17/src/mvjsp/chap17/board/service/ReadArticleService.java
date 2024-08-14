package mvjsp.chap17.board.service;

import java.sql.Connection;
import java.sql.SQLException;

import mvjsp.chap17.board.dao.ArticleDao;
import mvjsp.chap17.board.model.Article;
import mvjsp.jdbc.JdbcUtil;
import mvjsp.jdbc.connection.ConnectionProvider;

public class ReadArticleService {
	private static ReadArticleService instance = new ReadArticleService();
	public static ReadArticleService getInsteance() {
		return instance;
	}

	private ReadArticleService() {
	}

	public Article readArticle(int articleId) throws ArticleNotFoundException {
		return selectArticle(articleId, true);
	}

	private Article selectArticle(int articleId, boolean increaseCount)
			throws ArticleNotFoundException {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			ArticleDao articleDao = ArticleDao.getInstance();
			Article article = articleDao.selectById(conn, articleId);
			if (article == null) {
				throw new ArticleNotFoundException(
						"게시글이 존재하지 않음: " + articleId);
			}
			if (increaseCount) {
				articleDao.increaseReadCount(conn, articleId);
				article.setReadCount(article.getReadCount() + 1);
			}
			return article;
		} catch (SQLException e) {
			throw new RuntimeException("DB 에러: " + e.getMessage(), e);
		} finally {
			JdbcUtil.close(conn);
		}
	}

	public Article getArticle(int articleId) throws ArticleNotFoundException {
		return selectArticle(articleId, false);
	}
}
