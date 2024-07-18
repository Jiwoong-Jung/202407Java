package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExGridLayout extends JFrame {

	JButton jb1 = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	JButton jb3 = new JButton("버튼3");
	JButton jb4 = new JButton("버튼4");
	JButton jb5 = new JButton("버튼5");
	ExGridLayout() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));
		con.add(jb1);
		con.add(jb2);
		con.add(jb3);
		con.add(jb4);
		con.add(jb5);
		
		this.setLocation(1000, 200);
		this.setSize(700, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ExGridLayout();
	}

}
