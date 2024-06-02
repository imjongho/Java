package swingExample2;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class JList1 extends JFrame implements ListSelectionListener {

	private String[] fruitlist = {"apple", "banana", "orange", "lemon", "cherry"};
	private JList jlist = new JList(fruitlist);
	private ImageIcon[] fruitIcons = {
			new ImageIcon("apple.png"),
			new ImageIcon("banana.png"),
			new ImageIcon("orange.png"),
			new ImageIcon("lemon.png"),
			new ImageIcon("cherry.png")
	};
	private JLabel[] jlicon = new JLabel[6];
	private JLabel jlname = new JLabel();
	
	public JList1() {
		Container ct = getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 2, 5, 5));
		for(int i = 0; i < 5; i++) {
			p1.add(jlicon[i] = new JLabel());
		}
		JPanel p2 = new JPanel();
		p2.add(jlname);
		
		ct.add(jlist, BorderLayout.WEST);
		ct.add(p1, BorderLayout.CENTER);
		ct.add(p2, BorderLayout.EAST);
		jlist.addListSelectionListener(this);
		
		setTitle("JList Test1");
		setSize(700,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		for(int i = 0; i < 5; i++) {
			jlicon[i].setIcon(null);
		}
		int[] indices = jlist.getSelectedIndices();
		String s = "당신이 선택한 항목은 : ";
		for(int j = 0; j < indices.length; j++) {
			jlicon[j].setIcon(fruitIcons[indices[j]]);
			s = s + fruitlist[indices[j]] + " ";
		}
		jlname.setText(s);
	}
	
}


public class JListTest1 {
	public static void main(String[] args) {
		new JList1();
	}

}
