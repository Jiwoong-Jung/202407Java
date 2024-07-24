package p439;

public class Main {

	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new CallListener());
		button.touch();

	}

}
