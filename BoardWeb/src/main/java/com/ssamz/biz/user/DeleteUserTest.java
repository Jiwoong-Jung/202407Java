package com.ssamz.biz.user;

public class DeleteUserTest {

	public static void main(String[] args) {
		// 1. UserDAO 객체를 생성한다.
		UserDAO dao = new UserDAO();
		
		// 2. 회원 정보를 삭제한다. 
		dao.deleteUser("ssamz3");
		
		// 3. 목록을 조회한다. 
		dao.getUserList();
	}
}

