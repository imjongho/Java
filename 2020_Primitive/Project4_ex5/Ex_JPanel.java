package Project4_ex5;

import java.awt.*;
import javax.swing.*;

public class Ex_JPanel extends JFrame {
	
	public Ex_JPanel() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 1, 2, 2));
		
		JPanel pn1 = new JPanel(new BorderLayout());
		pn1.add(new JLabel("이름 : "), BorderLayout.WEST); 	// 객체 만든 후 add하삼
		pn1.add(new JTextField(), BorderLayout.CENTER);
		
		JPanel pn2 = new JPanel(new BorderLayout());
		pn2.add(new JLabel("나이 : "), BorderLayout.WEST);
		pn2.add(new JTextField(), BorderLayout.CENTER);
		
		JPanel pn3 = new JPanel(new BorderLayout());
		pn3.add(new JLabel("주소 : "), BorderLayout.WEST);
		pn3.add(new JTextField(), BorderLayout.CENTER);
		
		JPanel pn4 = new JPanel(new GridLayout(1, 3));
		pn4.add(new JButton("입력"));
		pn4.add(new JButton("수정"));
		pn4.add(new JButton("삭제"));
		
		c.add(pn1);
		c.add(pn2);
		c.add(pn3);
		c.add(pn4);
		
		setTitle("Panel");
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}
