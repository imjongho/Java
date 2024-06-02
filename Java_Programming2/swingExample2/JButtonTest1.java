package swingExample2;
import javax.swing.*;
import java.awt.*;

class JButton1 extends JFrame {
	public JButton1() {
		ImageIcon korea = new ImageIcon("korea.png");
		ImageIcon usa = new ImageIcon("usa.png");
		ImageIcon germany = new ImageIcon("germany.png");
		JButton nat = new JButton(korea);
		nat.setPressedIcon(usa);
		nat.setRolloverIcon(germany);
		Container ct = getContentPane();
		ct.add(nat);
		setTitle("JButton Test1");
		setSize(500, 400);
		setVisible(true);
	}
}

public class JButtonTest1 {
	public static void main(String[] args) {
		new JButton1();
	}
}
