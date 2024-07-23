package imageProc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyImage extends JFrame {
	
	MyImage() {
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Field field = new Field();
		Control control = new Control();
		this.add(field, BorderLayout.CENTER);
		this.add(control, BorderLayout.SOUTH);
		this.setBounds(1200, 100, 500, 500);
		this.setVisible(true);
	}
	
	private class Field extends JPanel {
		JLabel lbl;
		Field() {
			this.setLayout(new BorderLayout());
			lbl = new JLabel();
			lbl.setIcon(new ImageIcon("./src/stand.gif"));
			this.add(lbl, BorderLayout.CENTER);
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
			System.out.println("실행!");
			
		}
		
	}
	
	public static void main(String[] ar) {
		new MyImage();
	}

}
