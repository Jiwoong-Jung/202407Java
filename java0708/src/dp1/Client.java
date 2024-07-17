package dp1;

public class Client {
	private static final int INIT_LOCATION[] = {50, 100, 150};
	public static void main(String[] args) {
		Ball balls[] = new Ball[3];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new Ball(INIT_LOCATION[i], INIT_LOCATION[i]);
			balls[i].start();
		}

		balls[0].setDirectionStrategy(new HorizonalMoveStrategy());
		balls[0].setDrawStrategy(new BlueDrawStrategy());

		balls[1].setDirectionStrategy(new VerticalMoveStrategy());
		balls[1].setDrawStrategy(new BlueDrawStrategy());

		balls[2].setDirectionStrategy(new DiagonalMoveStrategy());
		balls[2].setDrawStrategy(new RedDrawStrategy());

		new BallFrame(balls);
	}
}
