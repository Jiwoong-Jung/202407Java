package project2Swing;

import java.io.Serializable;

public class Member implements Serializable {
	private String name;
	private String ssn;   // 주민번호 6자리 패스워드
	private String phone;
	private int balance;

	// 입금
	public void deposit(int deposit) {
		if(deposit <= 0) {
			System.out.println("금액을 정확히 입력하세요.");
	        return;
	    }
		balance += deposit;
	}
	
	 //출금
    public void withdraw(int withdraw) {
    	if (withdraw > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
 
        if (withdraw <= 0) {
            System.out.println("0원 및 마이너스 단위는 출금하실 수 없습니다.");
            return;
        }
    	balance -= withdraw;
    }
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", ssn=" + ssn + ", phone=" + phone + ", balance=" + balance + "]";
	}

	public Member(String name, String ssn, String phone) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}
	
	public Member() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
