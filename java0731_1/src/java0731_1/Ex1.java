package java0731_1;

import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {
		var map = new HashMap<String, Integer>();
		map.put("신", 86);
		map.put("홍", 90);
		map.put("신", 80);
		
		var ee = map.entrySet();
		for (var mm : ee) {
			var k1 = mm.getKey();
			System.out.println(k1);
			var v1 = mm.getValue();
			System.out.println(v1);
		}
	}

}
