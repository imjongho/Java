package swingExample3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel1 extends JPanel implements ActionListener {

	private JTextField jtf;
	private JTextArea jta;
	
	public Panel1() {
		jtf = new JTextField(20);
		jta = new JTextArea(5, 20);
		jta.setEditable(false);
		
		add(jtf);
		add(jta);
		jtf.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(jta.getLineCount() <= jta.getRows()) {
			jta.append(ae.getActionCommand() + "\n");
			jtf.setText("");
		}
		else {
			jtf.setEditable(false);
		}
	}
}


class Panel2 extends JPanel implements ItemListener {

	JTextField jtf;
	
	public Panel2() {
		JRadioButton jrb1 = new JRadioButton("JCheckBox");
		JRadioButton jrb2 = new JRadioButton("JButton");
		JRadioButton jrb3 = new JRadioButton("JComboBox");
		JRadioButton jrb4 = new JRadioButton("JLabel");
		jtf = new JTextField(20);
		
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(jrb4);
		add(jtf);
		
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		jtf.setText(((JRadioButton) ie.getItem()).getText());
	}
	
}


class Panel3 extends JPanel implements ItemListener {

	JTextField jtf;
	
	public Panel3() {
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("Flow Layout");
		jcb.addItem("Border Layout");
		jcb.addItem("Grid Layout");
		jtf = new JTextField(20);
		
		add(jcb);
		add(jtf);
		
		jcb.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		Object s = ie.getItem();
		jtf.setText(s.toString());
	}
	
}


class Panel4 extends JPanel implements ActionListener {

	JTextField jtf;
	
	public Panel4() {
		JCheckBox[] jcb = new JCheckBox[4];
		ButtonGroup gb = new ButtonGroup();
		JPanel spanel = new JPanel();
		String[] s = {"객체지향", "Interpreter 사용", "높은 이식성", "Multithread 제공"};
		for(int i = 0; i < 4; i++) {
			jcb[i] = new JCheckBox(s[i]);
			jcb[i].addActionListener(this);
			spanel.add(jcb[i]);
			gb.add(jcb[i]);
		}
		
		jtf = new JTextField(20);
		add(spanel);
		add(jtf);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
}


class GroupHolder extends JFrame {
	public GroupHolder() {
		JTabbedPane jtp = new JTabbedPane();
		Panel1 p1 = new Panel1();
		jtp.addTab("Text", p1);
		Panel2 p2 = new Panel2();
		jtp.addTab("Swing", p2);
		Panel3 p3 = new Panel3();
		jtp.addTab("Layout", p3);
		Panel4 p4 = new Panel4();
		jtp.addTab("Java", p4);
		
		getContentPane().add(jtp);
		setTitle("GroupHolder Test");
		setSize(550,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class GroupHolderTest {
	public static void main(String[] args) {
		new GroupHolder();
	}
}
