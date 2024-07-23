package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	String[] walk = {"walk1.gif", "walk2.gif"};
	String[] stand = {"stand.gif"};
	String[] run = {"run1.gif", "run2.gif", "run3.gif"};
	PATH p = PATH.STAND;
	String[] path = stand;
	MyFrame() {
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Field field = new Field();
		Control control = new Control();
		this.add(field, BorderLayout.CENTER);
		this.add(control, BorderLayout.SOUTH);
		this.setBounds(1200, 100, 500, 500);
		this.setVisible(true);
		
		//여기에 Thread를 객체 생성하여 start()메소드를 호출하세요.
		Thread thread = new Thread(field);
		thread.start();
	}
	
	private class Field extends JPanel implements Runnable {
		JLabel lbl;
		Field() {
			this.setLayout(new BorderLayout());
			lbl = new JLabel();
			lbl.setIcon(new ImageIcon("./src/stand.gif"));
			this.add(lbl, BorderLayout.CENTER);
		}
		@Override
		public void run() {
			while (true) {
				switch(p) {
				case STAND:
					path = stand;
					break;
				case WALK:
					path = walk;
					break;
				case RUN:
					path = run;
					break;
				default:
					path = stand;
				}
				
				for (int i = 0; i < path.length; i++) {
					lbl.setIcon(new ImageIcon("./src/" + path[i]));
//					System.out.println(i);
					try {
						Thread.sleep(300);  // 0.3초
					} catch (InterruptedException e) {}
				}
			}
			
		}
	}
	
	private class Control extends JPanel implements ActionListener {
		private JButton standingBtn, walkingBtn, runningBtn;
		public Control() {
			this.setLayout(new FlowLayout());

			standingBtn = new JButton("Standing");
			walkingBtn = new JButton("Walking");
			runningBtn = new JButton("Running");

			standingBtn.addActionListener(this);
			walkingBtn.addActionListener(this);
			runningBtn.addActionListener(this);
			this.add(standingBtn);
			this.add(walkingBtn);
			this.add(runningBtn);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == standingBtn) {
				p = PATH.STAND;
			} else if (e.getSource() == walkingBtn) {
				p = PATH.WALK;
			} else if (e.getSource() == runningBtn) {
				p = PATH.RUN;
			}
		}
	}
	
	public static void main(String[] ar) {
		new MyFrame();
	}
}



