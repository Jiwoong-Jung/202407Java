package swing;

import javax.swing.*;  
import java.awt.*;
 

public class Component extends JFrame{

	public Component() {
		
		setTitle("계산기 화면");
		setSize(300, 250);	

		
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300,40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		title.setFont(new Font("함초롱돋움", Font.BOLD, 20));
		titlePanel.add(title);	

		
			
		JPanel numPanel = new JPanel();		
		numPanel.setBounds(0, 40, 300, 40);
		add(numPanel);		
		JTextField num1 = new JTextField(5);	
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
	
		
		
		JPanel btPanel01 = new JPanel();	
		btPanel01.setBounds(0, 80, 300, 40);
		add(btPanel01);		
		JButton plus = new JButton("+");		
		btPanel01.add(plus);
		JButton minus = new JButton("-");
		btPanel01.add(minus);
		
		
		JPanel btPanel02 = new JPanel();	
		btPanel02.setBounds(0, 120, 300, 40);
		add(btPanel02);		
		JButton multiply = new JButton("*");	
		btPanel02.add(multiply);
		JButton divide = new JButton("/");
		btPanel02.add(divide);
				
		
		JPanel resultPanel = new JPanel();
		resultPanel.setBounds(0, 160, 300, 40);
		add(resultPanel);
		JLabel label01 = new JLabel("계산결과 : ");
		JLabel label02 = new JLabel("");
		resultPanel.add(label01);
		resultPanel.add(label02);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);		
		
	}
	
	public static void main(String[] args) {  
		new Component();
	}

}
