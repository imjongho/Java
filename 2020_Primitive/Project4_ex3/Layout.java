package Project4_ex3;

import java.awt.*;
import javax.swing.*;

public class Layout extends JFrame {
	
	public Layout() {
		// setLayout(new FlowLayout());
		setLayout(new GridLayout(3, 2, 5, 5));	// 3행 2열, 간격은 5로 설정
		
		JButton jb1, jb2, jb3, jb4, jb5, jb6;
		jb1 = new JButton("1번");
		jb2 = new JButton("2번");
		jb3 = new JButton("3번");
		jb4 = new JButton("4번");
		jb5 = new JButton("5번");
		jb6 = new JButton("6번");
		
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(jb6);
		
		// 1. setTitle("FlowLayout");
		setTitle("GridLayout");
		
		// 1. setSize(300, 150);
		setSize(300, 300);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
