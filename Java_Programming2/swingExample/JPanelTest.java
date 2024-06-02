package swingExample;
import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {	// 교수님 코드
	
	public JPanelTest() {
		JPanel pt, pb;
		JPanel pt1, pt2, pt3;
		JPanel pb1, pb2;
		getContentPane().setLayout(new GridLayout(2, 1));
		
		pt = new JPanel();
		pt.setLayout(new GridLayout(1, 3));
		
		pt1 = new JPanel();
		pt1.setLayout(new GridLayout(3, 1));
		JCheckBox red = new JCheckBox("Red", true);
		pt1.add(red);
		JCheckBox green = new JCheckBox("Green", false);
		pt1.add(green);
		JCheckBox blue = new JCheckBox("Blue", false);
		pt1.add(blue);
		
		pt2 = new JPanel();
		pt2.setLayout(new GridLayout(3, 1));
		JRadioButton jr1 = new JRadioButton("A형");
		pt2.add(jr1);
		JRadioButton jr2 = new JRadioButton("B형");
		pt2.add(jr2);
		JRadioButton jr3 = new JRadioButton("O형");
		pt2.add(jr3);
		
		pt3 = new JPanel();
		pt3.setLayout(new FlowLayout());
		JButton bt1 = new JButton(" 선 택 ");
		JButton bt2 = new JButton(" 취 소 ");
		pt3.add(bt1);
		pt3.add(bt2);
		
		pt.add(pt1);
		pt.add(pt2);
		pt.add(pt3);
		add(pt);
		
		pb = new JPanel();
		pb1 = new JPanel();
		JTextArea ta = new JTextArea("자료입력공간", 5, 30);
		pb1.add(ta);
		
		pb2 = new JPanel();
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("1구역 지역");
		jcb.addItem("2구역 지역");
		jcb.addItem("3구역 지역");
		pb2.add(jcb);
		
		pb.add(pb1);
		pb.add(pb2);
		add(pb);
	}
	
	
	public static void main(String[] args) {
		JPanelTest jpt = new JPanelTest();
		jpt.setTitle("Panel Test");
		jpt.setSize(480, 280);
		jpt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jpt.setVisible(true);
	}

}
