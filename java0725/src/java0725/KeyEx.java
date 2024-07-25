package java0725;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
//		HashMap<Integer, String> hashMap = new HashMap<>();
//		hashMap.put(1, "홍길동");
//		hashMap.put(2, "강하나");
//		String val = hashMap.get(2);
//		System.out.println(val);
		
		Key key1 = new Key(100);
		Key key2 = new Key(100);
		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());
		if (key1.equals(key2)) {
			System.out.println("같다");
		}
		
		HashMap<Key, String> hashMap = new HashMap<>();
		hashMap.put(new Key(1), "홍길동");
		String val = hashMap.get(new Key(1));
		System.out.println(val);

	}

}
