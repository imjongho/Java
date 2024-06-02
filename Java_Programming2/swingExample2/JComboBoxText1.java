package swingExample2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JComboBox1 extends JFrame implements ItemListener {

	JLabel jl;
	public JComboBox1() {
		jl = new JLabel();
		JComboBox jcb = new JComboBox();
		String fr[] = {"apple", "banana", "orange", "lemon", "cherry"};
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		for(int i = 0; i < 5; i++) {
			jcb.addItem(fr[i]);
		}
		ct.add(jcb);
		ct.add(jl);
		jcb.addItemListener(this);
		setTitle("JComboBox Test1");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String)ie.getItem();
		jl.setIcon(new ImageIcon(fruit + ".png"));
	}
	
}


public class JComboBoxText1 {
	public static void main(String[] args) {
		new JComboBox1();
	}

}
