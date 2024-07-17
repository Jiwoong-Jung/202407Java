package dp1;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Field extends JPanel implements Runnable {
	private static final long serialVersionUID = 1L;
	private Ball[] balls;
	public Field(Ball[] balls) {
		this.balls = balls;
		setLayout(new FlowLayout());

	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, BallFrame.WIDTH, BallFrame.HEIGHT);
		for (int i = 0; i < balls.length; i++) {
			g.setColor(balls[i].getColor());
			g.fillOval(balls[i].getX(), balls[i].getY(), Ball.SIZE, Ball.SIZE);
		}
	}

	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {}
		}
	}
}