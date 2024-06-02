package swingExample2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioPanel extends JPanel implements ActionListener {
	
	JLabel jl1 = new JLabel("당신의 성별은? ");
	JLabel jl2 = new JLabel("");
	
	public RadioPanel() {
		ButtonGroup gb = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("남자");
		JRadioButton jrb2 = new JRadioButton("여자");
		gb.add(jrb1);
		gb.add(jrb2);
		add(jl1);
		add(jl2);
		add(jrb1);
		add(jrb2);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		jl2.setText(s);
	}
}


class ComboPanel extends JPanel implements ItemListener {

	JLabel jl1 = new JLabel("당신의 혈액형은? ");
	JLabel jl2 = new JLabel("");
	
	public ComboPanel() {
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("A형");
		jcb.addItem("B형");
		jcb.addItem("AB형");
		jcb.addItem("O형");
		add(jl1);
		add(jl2);
		add(jcb);
		jcb.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent ie) {
		Object s = ie.getItem();
		jl2.setText(s.toString());
	}
}


class JTabbedPane1 extends JFrame {
	public JTabbedPane1() {
		JTabbedPane jtp = new JTabbedPane();
		RadioPanel rp = new RadioPanel();
		ComboPanel cp = new ComboPanel();
		jtp.addTab("성별", rp);
		jtp.addTab("혈액형", cp);
		getContentPane().add(jtp);
		setTitle("JTabbedPaneTest1");
		setSize(500,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class JTabbedPaneTest1 {
	public static void main(String[] args) {
		new JTabbedPane1();
	}

}
