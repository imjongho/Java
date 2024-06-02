package swingExample;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {	// JFrame 클래스로부터 상속
	
	public BorderLayoutTest() {
		Container ct = getContentPane();
		BorderLayout bl = new BorderLayout(10, 10);
		// BorderLayout 객체를 생성. 수직, 수평 간격을 10픽셀로 설정
		ct.setLayout(bl);
		// 레이아웃을 설정
		ct.add(new JButton("버튼1"), BorderLayout.NORTH);
		ct.add(new JButton("버튼2"), BorderLayout.CENTER);
		ct.add(new JButton("버튼3"), BorderLayout.SOUTH);
		// 5개의 버튼을 위치를 지정하여 프레임에 추가
	}
	
	public static void main(String[] args) {
		BorderLayoutTest bit = new BorderLayoutTest();
		// 자신의 클래스로부터 객체 생성
		bit.setTitle("BorderLayout Test");
		// 프레임의 타이틀을 설정
		bit.setSize(300, 150);
		bit.setVisible(true);
		bit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
