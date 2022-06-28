package Num1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JT20010459_E1 extends JFrame{
	private JPanel jp = new JPanel();
	private JLabel la = new JLabel("hello");
	JButton btn = new JButton("Mouse Event 테스트버튼");
	public JT20010459_E1() {
		setTitle("버튼에 Mouse 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		btn.setBackground(Color.YELLOW);
		btn.addMouseListener(new MyMouseListener());
		c.add(btn,BorderLayout.NORTH);
		c.add(jp,BorderLayout.CENTER);
		c.addMouseListener(new MyMousePressedListener());
		la.setSize(50,20);
		la.setLocation(30,30);
		jp.add(la);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		System.out.println("20010459 신예린");
		new JT20010459_E1();
	}
	class MyMousePressedListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y-btn.getHeight());
		}
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent e) {
			Component c= (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
	}	
}


