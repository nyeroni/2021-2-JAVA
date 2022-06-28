package Num1;
import java.awt.*;
import javax.swing.*;
public class JC20010459E1 extends JFrame {
	JC20010459E1(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		for(int i=0; i<20;i++) {
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			JLabel label = new JLabel();
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setOpaque(true);
			label.setBackground(Color.blue);
			c.add(label);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String []args) {
		new JC20010459E1();
	}
}
