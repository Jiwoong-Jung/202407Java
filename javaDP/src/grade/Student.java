package grade;

public class Student {
	private String name;
	private String hakbun;
	private double java;
	
	public Student(String name, String hakbun, double java) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.java = java;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", java=" + java + "]";
	}
	
	
	
}
