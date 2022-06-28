package Num2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class JC20010459E2 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public JC20010459E2() {
		setTitle("Make Drawing to Start");
		this.setContentPane(new MyPanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	class MyOne extends Thread{
		MyPanel panel;
		boolean start=true;
		Object obj = new Object();
		public MyOne(MyPanel panel){
			this.panel = panel;
		}
		public void go() {
			start=true;
			synchronized(obj) {
				obj.notify();
			}
		}
		public void st() {
			start=false;
		}
		@Override
		public void run() {
			try {
				synchronized(obj) {
					obj.wait();
				}
			}
			catch(InterruptedException e) {
				return;
			}
			while(true) {
				if(panel.isValid()) {
					if(start==false) {
						try {
							synchronized(obj) {
								obj.wait();
							}
						}
						catch(InterruptedException e) {
							return;
						}
					}
					int x=(int)(Math.random()*(panel.getSize().width-1));
					int y = (int)(Math.random()*(panel.getSize().height-1));
					int w = (int)(Math.random()*((panel.getSize().width)-x-1));
					int h = (int)(Math.random()*((panel.getSize().height)-y-1));

					panel.num1(x,y,w,h);
					panel.repaint();
				}

			
				try {
					Thread.sleep(300);
				}
				catch(InterruptedException e) {
					return;
				}
			}
		}
	}

	class MyPanel extends JPanel{
		Rectangle r = new Rectangle(0,0,0,0);
		MyOne th = new MyOne(this);
		public MyPanel(){
			addMouseListener(new MyMouseListener());
			th.start();
		}
		public void num1(int x, int y, int w, int h) {
			r.x=x;
			r.y=y;
			r.width=w;
			r.height=h;
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			g.fillOval(r.x, r.y, r.width, r.height);
		}

		class MyMouseListener extends MouseAdapter{
			public void mouseEntered(MouseEvent e) {
				th.go();
			}
			public void mouseExited(MouseEvent e) {
				th.st();
			}
		}
	}
	public static void main(String [] args) {
		new JC20010459E2();
	}
}
