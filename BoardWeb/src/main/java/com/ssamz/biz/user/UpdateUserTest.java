package com.ssamz.biz.user;

public class UpdateUserTest {

	public static void main(String[] args) {
		// 1. UserDAO 객체를 생성한다.
		UserDAO dao = new UserDAO();
		
		// 2. 회원 정보를 수정한다. 
		UserVO vo = new UserVO();
		vo.setName("수정");
		vo.setRole("USER");
		vo.setId("ssamz4");
		dao.updateUser(vo);
		
		// 3. 목록을 조회한다. 
		dao.getUserList();
	}
}
