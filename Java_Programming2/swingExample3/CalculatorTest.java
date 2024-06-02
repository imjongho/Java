package swingExample3;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {

	JTextField tField;
	JButton[] buttons;
	String[] labels = {
			"7", "8", "9", "/", "sqrt", 
			"4", "5", "6", "*", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "="};
	
	public Calculator() {
		tField = new JTextField(35);
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		// panel1
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "계산 결과 창"));
		panel1.add(tField);
		
		// panel2
		JPanel panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "지우기 버튼"));
		panel2.setLayout(new GridLayout(1, 2));
		JButton jb1 = new JButton("Backspace");
		JButton jb2 = new JButton("C");
		panel2.add(jb1);
		panel2.add(jb2);
		
		// panel3
		JPanel panel3 = new JPanel();
		panel3.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "계산기 입력 버튼"));
		panel3.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		
		int index = 0;
		for(int rows = 0; rows < 4; rows++) {
			for(int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				panel3.add(buttons[index]);
				buttons[index].addActionListener(this);
				index++;
			}
		}
		
		
		ct.add(panel1, BorderLayout.NORTH);
		ct.add(panel2, BorderLayout.CENTER);
		ct.add(panel3, BorderLayout.SOUTH);
		
		setTitle("Calculator");
		setVisible(true);
		pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		tField.setText(ae.getActionCommand());
	}
	
}


public class CalculatorTest {
	public static void main(String[] args) {
		new Calculator();
	}

}
