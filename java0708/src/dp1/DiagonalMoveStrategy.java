package dp1;

public class DiagonalMoveStrategy extends DirectionStrategy {
	public void move(Ball ball) {
		ball.setInvervals(Ball.INTERVAL, Ball.INTERVAL);
	}
}
