package swingExample3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TenLableClick extends JFrame {

	int cnt = 0;
	JLabel[] label = new JLabel[10];
	// String[] s = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	public TenLableClick() {
		Container ct = getContentPane();
		ct.setLayout(null);
		
		for(int i = 0; i < label.length; i++) {	// 10개
			label[i] = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			label[i].setOpaque(true);
			label[i].setForeground(Color.MAGENTA);
			label[i].setSize(10, 10);
			label[i].setLocation(x, y);
			ct.add(label[i]);
			label[i].addMouseListener(new MyMouseListener());
		}
			
		setTitle("Ten 레이블 클릭");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			JLabel jl = (JLabel)e.getSource();
			if(jl == label[cnt]) {
				label[cnt].setVisible(false);
				cnt++;
				if(cnt == 10) {
					new TenLableClick();
					dispose();
				}
			}
		}
	}
	
}



public class TenLableClickTest {
	public static void main(String[] args) {
		new TenLableClick();

	}

}
