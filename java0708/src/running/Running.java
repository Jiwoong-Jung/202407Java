package running;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Running extends JFrame {
	private static final long serialVersionUID = 1L;
	private Field field;
	private Controller controller;
	private MovingStrategy strategy = new StandingStrategy();

	public Running() {
		super("Running");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		field = new Field();
		controller = new Controller();

		add(field, BorderLayout.CENTER);
		add(controller, BorderLayout.SOUTH);

		setSize(500, 500);
		setVisible(true);

		Thread th = new Thread(field);
		th.start();
	}

	private class Field extends JPanel implements Runnable {
		private static final long serialVersionUID = 1L;
		private JLabel lbl;
		public Field() {
			setLayout(new BorderLayout());
			lbl = new JLabel();
			lbl.setIcon(new ImageIcon("./src/stand.gif"));
			add(lbl, BorderLayout.CENTER);
		}
		public void run() {
			while (true) {
				String[] path = strategy.getImages();
				for (int i = 0; i < path.length; i++) {
					lbl.setIcon(new ImageIcon("./src/" + path[i]));
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {}
				}
			}
		}
	}

	private class Controller extends JPanel implements ActionListener {
		private static final long serialVersionUID = 1L;
		private JButton standingBtn, walkingBtn, runningBtn;
		public Controller() {
			setLayout(new FlowLayout());

			standingBtn = new JButton("Standing");
			walkingBtn = new JButton("Walking");
			runningBtn = new JButton("Running");

			standingBtn.addActionListener(this);
			walkingBtn.addActionListener(this);
			runningBtn.addActionListener(this);

			add(standingBtn);
			add(walkingBtn);
			add(runningBtn);

		}
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if (btn == standingBtn) {
				strategy = new StandingStrategy();
			} else if (btn == walkingBtn) {
				strategy = new WalkingStrategy();
			} else if (btn == runningBtn) {
				strategy = new RunningStrategy();
			}
		}

	}

}
