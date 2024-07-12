package project1;

public class Member {
	String name;
	String ssn;   // 주민번호 6자리 패스워드
	String phone;
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", ssn=" + ssn + ", phone=" + phone + "]";
	}

	public Member(String name, String ssn, String phone) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}
	
	public Member() {}
	
	
	
}
