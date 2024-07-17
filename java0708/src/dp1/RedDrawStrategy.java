package dp1;

import java.awt.Color;

public class RedDrawStrategy extends DrawStrategy {

	@Override
	public void draw(Ball ball) {
		ball.setColor(Color.red);
	}

}
