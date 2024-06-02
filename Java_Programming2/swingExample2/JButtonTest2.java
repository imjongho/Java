package swingExample2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButton2 extends JFrame implements ActionListener {

	JTextField jtf;
	
	public JButton2() {
		jtf = new JTextField(10);
		ImageIcon apple = new ImageIcon("apple.png");
		ImageIcon banana = new ImageIcon("banana.png");
		ImageIcon cherry = new ImageIcon("cherry.png");
		ImageIcon lemon = new ImageIcon("lemon.png");
		ImageIcon orange = new ImageIcon("orange.png");
		
		JButton jb1 = new JButton("사과", apple);
		JButton jb2 = new JButton("바나나", banana);
		JButton jb3 = new JButton("체리", cherry);
		JButton jb4 = new JButton("레몬", lemon);
		JButton jb5 = new JButton("오렌지", orange);
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,2));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(jtf);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		setTitle("JButton Test2");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
	
}

public class JButtonTest2 {
	public static void main(String[] args) {
		new JButton2();

	}

}
