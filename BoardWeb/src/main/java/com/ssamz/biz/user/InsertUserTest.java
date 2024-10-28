package com.ssamz.biz.user;

public class InsertUserTest {

	public static void main(String[] args) {
		// 1. UserDAO 객체를 생성한다.
		UserDAO dao = new UserDAO();
		
		// 2. 회원 정보를 등록한다. 
		UserVO vo = new UserVO();		
		vo.setName("쌤즈");
		vo.setRole("USER");
		vo.setId("ssamz4");
		vo.setPassword("ssamz123");
		dao.insertUser(vo);
		
		// 3. 목록을 조회한다. 
		dao.getUserList();
	}
}

