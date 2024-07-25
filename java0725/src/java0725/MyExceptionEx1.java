package java0725;

class MyClass {
	void method() throws MyException {
		int x = 100;
		if (x > 90) {
			throw new MyException("나의 예외!!");  // 예외 발생
		}
		
	}
}

public class MyExceptionEx1 {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		try {
			mc.method();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
