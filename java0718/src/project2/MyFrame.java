package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JLabel la1 = new JLabel("아이디"); JLabel la2 = new JLabel("SSN"); JLabel la3 = new JLabel("전화번호");
	JTextField tf1 = new JTextField(5); JTextField tf2 = new JTextField(5);
	JTextField tf3 = new JTextField(10);
	JTextArea ta = new JTextArea(20, 50);
	JButton bt1 = new JButton("로그인"); JButton bt2 = new JButton("회원가입"); JButton bt3 = new JButton("예금");
	JButton bt4 = new JButton("출금"); JButton bt5 = new JButton("잔고");
	MyFrame() {
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(jp1, BorderLayout.NORTH);
		jp1.setLayout(new FlowLayout());
		jp1.add(la1); jp1.add(tf1); jp1.add(la2); jp1.add(tf2); jp1.add(la3); jp1.add(tf3);
		
		con.add(jp2, BorderLayout.CENTER);
		jp2.setLayout(new FlowLayout());
		jp2.add(ta);
		
		con.add(jp3, BorderLayout.SOUTH);
		jp3.setLayout(new FlowLayout());
		jp3.add(bt1); jp3.add(bt2); jp3.add(bt3); jp3.add(bt4); jp3.add(bt5);
		
		this.setBounds(1200, 200, 700, 400);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] ar) {
		new MyFrame();
	}

}
