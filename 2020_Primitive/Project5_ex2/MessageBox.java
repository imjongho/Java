package Project5_ex2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessageBox extends JFrame {
	
	public MessageBox() {
		Container cont = getContentPane();
		
		setTitle("로그인");
		setSize(300, 200);
		cont.setLayout(null);
		
		JButton messageBtn = new JButton("메세지 창 띄우기");
		messageBtn.setSize(150, 50);
		messageBtn.setLocation(70, 50);
		
		messageBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "메세지 출력");
			}
		});
		
		cont.add(messageBtn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
