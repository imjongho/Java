package swingExample;
import javax.swing.*;
import java.awt.*;

class FlowLayout1 extends JFrame {
	
	public FlowLayout1() {
		Container ct = getContentPane();
		FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT, 10, 15);
		ct.setLayout(f1);
		
		for(int i = 1; i <= 15; i++) {
			ct.add(new JButton("버튼" + i));
		}
		
		setTitle("FlowLayout Test1");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class FlowLayoutTest1 {
	public static void main(String[] args) {
		new FlowLayout1();

	}

}
