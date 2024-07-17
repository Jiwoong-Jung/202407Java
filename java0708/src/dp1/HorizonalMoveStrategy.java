package dp1;

public class HorizonalMoveStrategy extends DirectionStrategy{
	public void move(Ball ball){
		ball.setInvervals(Ball.INTERVAL, 0);
	}
}
