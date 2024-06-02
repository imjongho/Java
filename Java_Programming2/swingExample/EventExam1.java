package swingExample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventExam extends JFrame implements ActionListener {
	
	JLabel jl;
	
	public EventExam() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		JButton jb1 = new JButton("1학년");
		JButton jb2 = new JButton("2학년");
		JButton jb3 = new JButton("3학년");
		JButton jb4 = new JButton("4학년");
		jl = new JLabel("");
		
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jl);
		
		setTitle("Event Test1");
		setSize(330, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		jl.setText(e.getActionCommand());
	}
}


public class EventExam1 {
	public static void main(String[] args) {
		new EventExam();
	}

}
