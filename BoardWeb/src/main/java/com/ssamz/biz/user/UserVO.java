package com.ssamz.biz.user;

import lombok.Data;

// VO 클래스 
@Data
public class UserVO {
	// private 멤버변수 선언
	private String id;
	private String password;
	private String name; 
	private String role;
}
