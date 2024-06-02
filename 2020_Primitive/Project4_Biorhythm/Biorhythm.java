package Project4_Biorhythm;

import javax.swing.*;
import java.awt.*;

public class Biorhythm extends JFrame {
	
	public Biorhythm() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout(0, 0, 0));
		int w = 484, h = 22;
		
		JPanel pn1 = new JPanel(new GridLayout(1, 4, 3, 0));
		JProgressBar[] jpb = new JProgressBar[4];
		for(int i = 0; i < 4; i++) {
			jpb[i] = new JProgressBar(JProgressBar.VERTICAL);
			jpb[i].setMaximum(100);
			jpb[i].setMinimum(-100);
			pn1.add(jpb[i]);
		}
		pn1.setPreferredSize(new Dimension(w, 150));
		
		JPanel pn2 = new JPanel(new GridLayout(1, 4));
		String[] index_label = {"신체지수", "감성지수", "지성지수", "지각지수"};
		JLabel[] index = new JLabel[4];
		
		for(int i = 0; i < 4; i++) {
			index[i] = new JLabel(index_label[i]);
			index[i].setHorizontalAlignment(JLabel.CENTER);
			index[i].setFont(new Font("돋움체", Font.BOLD, 13));
			pn2.add(index[i]);
		}
		pn2.setPreferredSize(new Dimension(w, h));
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(Color.LIGHT_GRAY);
		JLabel birth_name = new JLabel("생년월일 입력");
		birth_name.setFont(new Font("돋움체", Font.BOLD, 13));
		pn3.add(birth_name);
		pn3.setPreferredSize(new Dimension(w, h));
		
		JPanel pn4 = new JPanel(new GridLayout(1, 3));
		String[] birth_label = {"연도", "월", "일"};
		JLabel[] birth = new JLabel[3];
		
		for(int i = 0; i < 3; i++) {
			birth[i] = new JLabel(birth_label[i]);
			birth[i].setHorizontalAlignment(JLabel.CENTER);
			birth[i].setFont(new Font("돋움체", Font.BOLD, 13));
			pn4.add(birth[i]);
		}
		pn4.setPreferredSize(new Dimension(w, h));
		
		JPanel pn5 = new JPanel(new GridLayout(1, 3, 5, 0));
		JTextField year = new JTextField();
		JTextField month = new JTextField();
		JTextField day = new JTextField();
		pn5.add(year);
		pn5.add(month);
		pn5.add(day);
		pn5.setPreferredSize(new Dimension(w, h));
		
		JPanel pn6 = new JPanel(new BorderLayout());
		JButton calc = new JButton("계산");
		calc.setFont(new Font("돋움체", Font.BOLD, 13));
		pn6.add(calc, BorderLayout.CENTER);
		pn6.setPreferredSize(new Dimension(w, h));
		
		c.add(pn1);
		c.add(pn2);
		c.add(pn3);
		c.add(pn4);
		c.add(pn5);
		c.add(pn6);
		
		setTitle("Today_Biorhythm");
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
