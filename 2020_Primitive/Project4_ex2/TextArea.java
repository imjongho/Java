package Project4_ex2;

import java.awt.FlowLayout;
import javax.swing.*;

public class TextArea extends JFrame {
	
	public TextArea() {
		JTextArea ta = new JTextArea("안녕하세요", 10, 25);	// 10행 25열
		ta.selectAll();
		
		add(ta);
		
		setTitle("Memo");
		setSize(300, 250);
		setLayout(new FlowLayout());	// 뒤에서 배율 배치 관리자
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
