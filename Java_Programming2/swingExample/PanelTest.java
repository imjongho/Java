package swingExample;
import javax.swing.*;
import java.awt.*;


class PT extends JFrame {
	
	public PT() {
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(2, 1, 1, 1));
		
		// pt
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(1, 3));
		
		JPanel jp1_1 = new JPanel();
		JPanel jp1_2 = new JPanel();
		JPanel jp1_3 = new JPanel();
		
		// pt1
		jp1_1.setLayout(new GridLayout(3, 1));
		jp1_1.add(new JCheckBox("Red", true));
		jp1_1.add(new JCheckBox("Green", false));
		jp1_1.add(new JCheckBox("Blue", false));
		
		// pt2
		jp1_2.setLayout(new GridLayout(3, 1));
		jp1_2.add(new JRadioButton("A형"));
		jp1_2.add(new JRadioButton("B형"));
		jp1_2.add(new JRadioButton("O형"));
		
		// pt3
		jp1_3.setLayout(new FlowLayout());
		jp1_3.add(new JButton(" 선 택 "));
		jp1_3.add(new JButton(" 취 소 "));

		jp1.add(jp1_1);
		jp1.add(jp1_2);
		jp1.add(jp1_3);
		
		
		// pb
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		
		// pb1
		JTextArea ta = new JTextArea("자료입력공간", 5, 30);
		jp2.add(ta);
		
		// pb2
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("1구간 지역");
		jcb.addItem("2구간 지역");
		jp2.add(jcb);
		
		ct.add(jp1);
		ct.add(jp2);
		
		setTitle("Panel Test");
		setVisible(true);
		setSize(480, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}



public class PanelTest {
	public static void main(String[] args) {
		new PT();

	}

}
