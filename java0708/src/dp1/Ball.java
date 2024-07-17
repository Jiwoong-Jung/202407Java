package dp1;

import java.awt.Color;

public class Ball extends Thread {
	public static final int SIZE = 20;
	public static final int INTERVAL = 10;
	private int x, y;
	private int xInterval, yInterval;
	private DirectionStrategy directionStrategy;
	private DrawStrategy drawStrategy;
	private Color color;

	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.xInterval = this.yInterval = 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setInvervals(int xInterval, int yInterval) {
		this.xInterval = xInterval;
		this.yInterval = yInterval;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return this.color;
	}

	public void setDirectionStrategy(DirectionStrategy directionStrategy) {
		this.directionStrategy = directionStrategy;
	}

	public void setDrawStrategy(DrawStrategy drawStrategy) {
		this.drawStrategy = drawStrategy;
	}

	public void draw() {
		drawStrategy.draw(this);
	}

	public void move() {
		directionStrategy.move(this);
	}

	public void run() {
		while (true) {
			x += xInterval;
			y += yInterval;

			if ((x < 0 && xInterval < 0) || x + Ball.SIZE > BallFrame.WIDTH - 15 && xInterval > 0) {
				xInterval = -xInterval;
			}
			if ((y < 0 && yInterval < 0) || y + Ball.SIZE > BallFrame.HEIGHT - 40 && yInterval > 0) {
				yInterval = -yInterval;
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {}
		}
	}
}