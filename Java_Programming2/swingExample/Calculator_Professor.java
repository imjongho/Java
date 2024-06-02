package swingExample;
import javax.swing.*;
import java.awt.*;

public class Calculator_Professor extends JFrame {	// 교수님 코드

	JTextField tField;
	JPanel panel;
	JButton[] buttons;
	String[] labels = {"Backspace", "", "", "CE", "C", 
			"7", "8", "9", "/", "sqrt", 
			"4", "5", "6", "*", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "="};
	
	public Calculator_Professor() {
		tField = new JTextField(35);
		tField.setText("0.");
		tField.setEnabled(false);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		
		int index = 0;
		for(int rows = 0; rows < 5; rows++) {
			for(int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if(cols >= 3) {
					buttons[index].setForeground(Color.red);
				}
				else {
					buttons[index].setForeground(Color.blue);
				}
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	

	
	public static void main(String[] args) {
		Calculator_Professor s = new Calculator_Professor();
	}

}
