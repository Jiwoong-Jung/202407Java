package java0729;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex4 {

	public static void main(String[] args) {
		Date now = new Date();  // 스레드 사용시 비추천
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");  // 스레드 사용시 비추천
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
//		LocalDateTime now2 = LocalDateTime.now();
//		String strNow2 = sdf.format(now2);
//		System.out.println(strNow2);
		
		LocalDateTime now1 = LocalDateTime.now();
		String strNow1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일").format(now1);
		System.out.println(strNow1);


	}

}
