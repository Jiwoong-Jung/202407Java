package account;

public class AccountDTO {
	private int id;
	private String name;
	private String ssn;
	private String tel;
	private int balance;
	
	public AccountDTO(int id, String name, String ssn, String tel, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", balance=" + balance
				+ "]";
	}
	
	
	

}
