import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JC20010459Q08 extends JFrame {
	JComboBox<String> combo = new JComboBox<String>();
	public JC20010459Q08() {
		setTitle("JTextField and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JTextField jt = new JTextField(15);
		
		c.add(jt);
		jt.addActionListener(new MyActionListener());
		c.add(combo);
		setSize(300,300);
		setVisible(true);
		
	}
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JTextField j = (JTextField)e.getSource();
			combo.addItem(j.getText());
			j.setText("");
		}
	}
	public static void main (String []args) {
		new JC20010459Q08();
	}
}
