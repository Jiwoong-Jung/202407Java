package main;

import blog.dao.BlogDAO;

public class TestMain {
	public static void main(String[] args) {
		BlogDAO dao = new BlogDAO();
		int age = dao.searchAge("박하나");
		System.out.println(age);
	}
}
