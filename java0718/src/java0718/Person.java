package java0718;

public class Person {
	private Role role;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void doIt() {
		role.doIt();
	}

}
