package swingExample;
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	
	public Calculator() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		JTextField tField = new JTextField(35);
		tField.setText("0.");
		tField.setEnabled(false);
		jp1.add(tField);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(5, 5, 1, 1));
		
		JButton[] jb = new JButton[25];
		
		jb[0] = new JButton("Backspace");
		jb[1] = new JButton("");
		jb[2] = new JButton("");
		jb[3] = new JButton("CE");
		jb[4] = new JButton("C");
		
		jb[5] = new JButton("7");
		jb[6] = new JButton("8");
		jb[7] = new JButton("9");
		jb[8] = new JButton("/");
		jb[9] = new JButton("sqrt");
		
		jb[10] = new JButton("4");
		jb[11] = new JButton("5");
		jb[12] = new JButton("6");
		jb[13] = new JButton("*");
		jb[14] = new JButton("%");
		
		jb[15] = new JButton("1");
		jb[16] = new JButton("2");
		jb[17] = new JButton("3");
		jb[18] = new JButton("-");
		jb[19] = new JButton("1/x");
		
		jb[20] = new JButton("0");
		jb[21] = new JButton("+/-");
		jb[22] = new JButton(".");
		jb[23] = new JButton("+");
		jb[24] = new JButton("=");
		
		
		for(int i = 0; i < 25; i++) {
			jp2.add(jb[i]);
			jb[i].setBackground(Color.yellow);
			
			if((i%5==3) || (i%5==4)) {
				jb[i].setForeground(Color.red);
			}
			else {
				jb[i].setForeground(Color.blue);
			}
		}
		
		
		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jp2, BorderLayout.SOUTH);
		
		setTitle("Calculator");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}




public class CalculatorTest {
	public static void main(String[] args) {
		new Calculator_Professor();

	}

}
