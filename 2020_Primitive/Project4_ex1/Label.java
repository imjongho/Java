package Project4_ex1;

import javax.swing.*;

public class Label extends JFrame {
	
	public Label() {
		JLabel lb1 = new JLabel("이름 : ");
		lb1.setLocation(50, 50);
		lb1.setSize(50, 20);
		
		JTextField tf1 = new JTextField(50);	// 열 지정 : 50칸
		tf1.setLocation(90, 50);
		tf1.setSize(100, 20);
		
		JLabel lb2 = new JLabel("나이 : ");
		lb2.setLocation(50, 70);
		lb2.setSize(50, 20);
		
		JTextField tf2 = new JTextField(50);
		tf2.setLocation(90, 70);
		tf2.setSize(100, 20);
		
		JButton jb = new JButton("확인");
		jb.setLocation(110, 100);
		jb.setSize(60, 30);
		
		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2);
		add(jb);
		
		setTitle("Test");
		setSize(300, 200);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
