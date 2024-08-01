package sec01.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		int cnt = 0;
		byte[] buf = new byte[5];
		
		int data = is.read(buf, 2, 3);
		for (int i=0; i < buf.length; i++) {
			System.out.println(buf[i]);
		}
//		while(true) {
//			++cnt;
//			int data = is.read(buf);
//			if(data == -1) break;
//			System.out.println(data);
//			for (int i=0; i < data; i++) {
//				System.out.println(buf[i]);
//			}
//		}
//		System.out.println(cnt);
		is.close();
	}
}
