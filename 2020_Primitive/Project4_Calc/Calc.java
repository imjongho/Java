package Project4_Calc;

import java.awt.*;
import javax.swing.*;

public class Calc extends JFrame {
	
	public Calc() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1));
		
		JPanel up_pn = new JPanel();
		JTextArea ta = new JTextArea();
		up_pn.setBackground(Color.WHITE);
		up_pn.add(ta);
		
		JPanel down_pn = new JPanel(new GridLayout(5, 4));
		JButton jb[] = new JButton[20];
		String button_value[] = {"CE", "C", "←", "/",
				"7", "8", "9", "x", "4", "5", "6", "-",
				"1", "2", "3", "+", " ", "0", ".", "="};
		
		for(int i = 0; i < 20; i++) {
			jb[i] = new JButton(button_value[i]);
			down_pn.add(jb[i]);
		}
		
		c.add(up_pn);
		c.add(down_pn);
		
		setTitle("Calculator");
		setSize(300, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
