package java0731_1;

public class Ex2 {

	public static void main(String[] args) {
		String str = "{\n"
				+ "\"user\" : \"홍길동\", \n"
				+ "\"age\" : 30\n"
				+ "}";
		System.out.println(str);
		
		String str2 = """
		{
			"user" : "홍길동", 
			"age" : 30
		}
	 	""";
		System.out.println(str2);

	}

}
