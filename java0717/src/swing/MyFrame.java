package swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MyFrame {
	public static void main(String[] ar) {
		new MouseListenerEx();
	}

}

class MouseListenerEx extends JFrame {
	JPanel jp = new JPanel();
	JLabel la = new JLabel("No Mouse Event");
	
	MouseListenerEx() {
		this.setContentPane(jp);
		jp.add(la);
		this.setSize(300, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jp.addMouseListener(new MyMouseListener());
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText(e.getX() + "," + e.getY());
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}


