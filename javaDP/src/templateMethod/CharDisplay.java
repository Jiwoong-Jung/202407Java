package templateMethod;

public class CharDisplay extends AbstractDisplay {
	private char ch; // 표시해야 하는 문자 
    public CharDisplay(char ch) { // 생성자
        this.ch = ch;
    }

	@Override
	public void open() {
		 // 시작 문자열 "<<"를 표시한다
        System.out.print("<<");
	}

	@Override
	public void print() {
		// 필드에 기억해 둔 문자를 1회 표시한다 
        System.out.print(ch);
	}

	@Override
	public void close() {
		// 종료 문자열 ">>"를 표시한다 
        System.out.println(">>");
	}

}
