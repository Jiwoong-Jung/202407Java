package templateMethod;

public class StringDisplay extends AbstractDisplay {
	private String string;  // 표시해야 하는 문자열 
    private int width;      // 문자열의 길이

    public StringDisplay(String string) {  // 생성자
        this.string = string;
        this.width = string.length();
    }
    
    // open과 close에서 호출되어 "+----+" 문자열을 표시하는 메소드
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

	@Override
	public void open() {
		printLine();	
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}
}
