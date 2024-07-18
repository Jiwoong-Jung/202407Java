package anony;

public class Anony {
	void method() {
		Person3 person3 = new Person3() {
			
			@Override
			public void wake() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Person2 person2 = new Person2() {

			@Override
			void wake() {
				// TODO Auto-generated method stub
				super.wake();
			}
			
		};
		
		Person person1 = new Child();
		
		Person person = new Person() {

			@Override
			void wake() {
				// TODO Auto-generated method stub
				super.wake();
			}
			
		};
	}
}
