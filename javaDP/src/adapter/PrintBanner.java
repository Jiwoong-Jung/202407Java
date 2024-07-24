package adapter;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		this.showWithParen();
		
	}

	@Override
	public void printStrong() {
		this.showWithAster();
		
	}

}
