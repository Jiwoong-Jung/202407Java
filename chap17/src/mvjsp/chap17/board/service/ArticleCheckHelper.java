package mvjsp.chap17.board.service;

import java.sql.Connection;
import java.sql.SQLException;

import mvjsp.chap17.board.dao.ArticleDao;
import mvjsp.chap17.board.model.Article;

public class ArticleCheckHelper {

	public Article checkExistsAndPassword(Connection conn, int articleId,
			String password) throws SQLException, ArticleNotFoundException,
			InvalidPasswordException {
		ArticleDao articleDao = ArticleDao.getInstance();
		Article article = articleDao.selectById(conn, articleId);
		if (article == null) {
			throw new ArticleNotFoundException(
					"게시글이 존재하지 않음: " + articleId);
		}
		if (!checkPassword(article.getPassword(), password)) {
			throw new InvalidPasswordException("암호 틀림");
		}
		return article;
	}

	private boolean checkPassword(String realPassword, 
			String userInputPassword) {
		if (realPassword == null) {
			return false;
		}
		if (realPassword.length() == 0) {
			return false;
		}
		return realPassword.equals(userInputPassword);
	}

}
