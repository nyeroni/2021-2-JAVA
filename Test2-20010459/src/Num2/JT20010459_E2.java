package Num2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyRun implements Runnable{
	private JLabel timerLabel;
	public MyRun(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class JT20010459_E2 extends JFrame {
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	private JLabel la = new JLabel("hello");
	public JT20010459_E2() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,1,12,12));
		c.add(jp1);
		jp1.addMouseListener(new MyMouseListener());
		la.setSize(50,20);
		la.setLocation(20,20);
		jp1.add(la);
		
		c.add(jp2);
		c.add(jp3);
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		jp3.add(timerLabel);
		Thread th = new Thread(new MyRun(timerLabel));
		th.start();
		c.add(jp4);

		setSize(500,300); 
		
		setVisible(true);
	}
	public static void main(String [] args) {
		System.out.println("20010459 ½Å¿¹¸°");
		new JT20010459_E2();
	}
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y=e.getY();
			la.setLocation(x,y);
		}
	}
}
