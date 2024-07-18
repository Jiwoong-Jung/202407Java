package java0718;

public abstract class Phone {
	String name;
	void turnOn() {
		System.out.println("폰 켜기");
	}
	abstract void turnOff();
}
