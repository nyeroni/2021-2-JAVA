import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JC20010459Q07 extends JFrame{
	Container c = getContentPane();
	public JC20010459Q07() {
		setTitle("드래깅동안 YELLOW 배경색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setBackground(Color.GREEN);
		c.setLayout(new FlowLayout());
		c.addMouseListener(new MyMouseAdapter());
		c.addMouseMotionListener(new MyMouseMotionAdapter());
		
		setSize(300,150);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
			c.setBackground(Color.GREEN);
		}
	}
	class MyMouseMotionAdapter extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.YELLOW);
		}
	}
	public static void main(String []args) {
		new JC20010459Q07();
	}
}
