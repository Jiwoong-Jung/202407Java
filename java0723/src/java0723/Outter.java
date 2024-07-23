package java0723;

public class Outter {
	
	public void method2(int arg) {
		int localVar = 10;
		
//		arg = 100;
//		localVar = 1;
		
		class Inner {
			public void method() {
				int result = arg + localVar;
				System.out.println(result);
			}
		}
		
		Inner inner = new Inner();
		inner.method();
		
	}

}
