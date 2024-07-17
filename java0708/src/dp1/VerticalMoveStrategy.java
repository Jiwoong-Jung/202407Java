package dp1;

public class VerticalMoveStrategy extends DirectionStrategy {
	public void move(Ball ball) {
		ball.setInvervals(0, Ball.INTERVAL);
	}
}
