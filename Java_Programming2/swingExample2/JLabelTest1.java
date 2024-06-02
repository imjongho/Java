package swingExample2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JLabel1 extends JFrame implements ActionListener {
	
	private JLabel result = new JLabel();
	public ImageIcon i1, i2;
	
	public JLabel1() {
		i1 = new ImageIcon("apple.png");
		i2 = new ImageIcon("banana.png");
		JButton apple = new JButton("사과");
		JButton banana = new JButton("바나나");
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(apple);
		ct.add(banana);
		ct.add(result);
		
		apple.addActionListener(this);
		banana.addActionListener(this);
		
		setTitle("JLabel Test1");
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand() == "사과") {
			result.setText("맜있는 사과입니다");
			result.setIcon(i1);
		}
		else {
			result.setText("맜있는 바나나입니다");
			result.setIcon(i2);
		}
	}
	
}


public class JLabelTest1 {
	public static void main(String[] args) {
		new JLabel1();

	}

}
