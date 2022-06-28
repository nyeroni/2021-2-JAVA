package Num2;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class JC20010459E2 extends JFrame {
	  private JLabel la = new JLabel("C");
	  public JC20010459E2() {
		  setTitle("클릭 연습 용 응용프로그램");
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Container c = getContentPane();
		  c.setLayout(null);
		  la.setLocation(100,100);
		  la.setSize(20,20);
		  la.addMouseListener(new MyMouseListener());
		  setSize(400,400);
		  setVisible(true);
		  la.setFocusable(true);
		  la.requestFocus();
		  c.add(la);

		  
	  }
	  class MyMouseListener extends MouseAdapter{
		  public void mouseClicked(MouseEvent e) {
			  JLabel la = (JLabel)e.getSource();
			  int x = (int)(Math.random()*300);
			  int y = (int)(Math.random()*300);
			  la.setLocation(x,y);
		  }
	  }
	  public static void main(String[] args) {
		  new JC20010459E2();
	  }
}
