package java0725;
class Member2 {
	String id;

	public Member2(String id) {
		super();
		this.id = id;
	}
	
}

public class MemberEx {
	public static void main(String[] ar) {
		String str1 = new String("blue");
		String str2 = new String("blue");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		if (str1.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		Member member1 = new Member("blue");
		Member member2 = new Member("blue");
		
		if (member1.equals(member2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
