package Num1;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class JC20010459E1 extends JFrame{
	private JRadioButton left = new JRadioButton("left");
	private JRadioButton right = new JRadioButton("right");
	private JLabel imageLabel;
	private Vector<ImageIcon> v = new Vector<ImageIcon>();
	private int check=0;
	public JC20010459E1() {
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		File f = new File("images");
		File files[] = f.listFiles();
		for(int i=0; i<files.length; i++) {
			if(files[i].isFile()) {
				ImageIcon icon = new ImageIcon(files[i].getPath());
				v.add(icon);
			}
		}
		JPanel panel = new JPanel();
		c.add(panel, BorderLayout.NORTH);
		imageLabel = new JLabel(v.get(0));
		c.add(imageLabel,BorderLayout.CENTER);
		ButtonGroup b = new ButtonGroup();
		b.add(left);
		b.add(right);
		panel.add(left);
		panel.add(right);

		imageLabel.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				if(!left.isSelected()&&!right.isSelected())return;
				if(left.isSelected()) {
					check--;
					if(check==-1) {
						check = v.size()-1;
					}
				}
				else {
					check++;
					if(check>=v.size()) {
						check=0;
					}

				}
				imageLabel.setIcon(v.get(check));
				
			}
			
		});
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new JC20010459E1();
	}

}
