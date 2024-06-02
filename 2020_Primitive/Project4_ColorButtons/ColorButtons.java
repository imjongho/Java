package Project4_ColorButtons;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class ColorButtons extends JFrame {
	
	public ColorButtons() {
		int max = 10;						 		// n열
		setLayout(new GridLayout(1, 10));
		// JButton 배열, 색상 배열 생성
		JButton jb[] = new JButton[max];	 		
		Color button_color[] = {Color.RED, Color.ORANGE,	
				Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY};
		
		for(int i = 0; i < max; i++) {
			jb[i] = new JButton(""+i+"");
			jb[i].setOpaque(true);					// 투명하게 설정
			jb[i].setBackground(button_color[i]);	// 배경색 설정
			add(jb[i]);								// 버튼을 컨텐트팬에 부착
		}
		
		setTitle("ColorButtons");
		setSize(600, 300);			// 컴퍼넌트 크기지정
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
