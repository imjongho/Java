package Project5_ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class IndepClassListner extends JFrame {
	
	public IndepClassListner() {	// 생성자
		setTitle("독립 클래스 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container ct = getContentPane();
		
		ct.setLayout(new FlowLayout());
		JButton jbtn = new JButton("Action");
		ct.add(jbtn);
		
		setSize(500, 300);
		setVisible(true);
		
		jbtn.addActionListener(new MyActionListner());
	}
	
	
	public static void main(String[] args) {
		new IndepClassListner();
	}
	
	
	public class MyActionListner implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton jbtn = (JButton)arg0.getSource();
			
			if(jbtn.getText().equals("Action")) {
				jbtn.setText("액션");
			}
			else {
				jbtn.setText("Action");
			}
		}
		
	}
	
}
