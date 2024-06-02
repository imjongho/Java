package swingExample;
import javax.swing.*;
import java.awt.*;

class RandomLabels extends JFrame {
	
	public RandomLabels() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.setLayout(null);
		
		
		for(int i = 0; i < 20; i++) {	// 20개
			JLabel label = new JLabel(Integer.toString(i));
			label.setOpaque(true);
			label.setBackground(Color.BLUE);
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			label.setLocation(x, y);
			label.setSize(10, 10);
			ct.add(label);
		}
			
		
		setTitle("Random Labels");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


public class RandomLabelsTest {
	public static void main(String[] args) {
		new RandomLabels();
	}

}

