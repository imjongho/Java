package Project4_ex4;

import java.awt.*;
import javax.swing.*;

public class Layout extends JFrame {
	
	public Layout() {
		setLayout(new BorderLayout());
		
		JButton jbE = new JButton("EAST");
		JButton jbW = new JButton("WEST");
		JButton jbS = new JButton("SOUTH");
		JButton jbN = new JButton("NORTH");
		JButton jbC = new JButton("CENTER");
		
		add(jbE, BorderLayout.EAST);
		add(jbW, BorderLayout.WEST);
		add(jbS, BorderLayout.SOUTH);
		add(jbN, BorderLayout.NORTH);
		add(jbC, BorderLayout.CENTER);
		
		setTitle("BorderLayout");
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}
