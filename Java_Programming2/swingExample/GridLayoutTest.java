package swingExample;
import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {

	public GridLayoutTest() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(4, 3, 10, 10);
		ct.setLayout(gl);
		for(int i = 1; i <= 10; i++) {
			ct.add(new JButton("레이아웃" + i));
		}
	}
	
	
	public static void main(String[] args) {
		GridLayoutTest glt = new GridLayoutTest();
		glt.setTitle("GridLayout Test");
		glt.setSize(400, 200);
		glt.setVisible(true);
		glt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
