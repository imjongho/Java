package swingExample3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RSPGame extends JFrame implements ActionListener {
	
	JLabel me;
	JLabel com;
	JLabel result;	// 바뀌는 값
	String s[] = {"scissor", "rock", "paper"};
	ImageIcon[] imageicon = new ImageIcon[3];
	JButton[] jb = new JButton[3];
	
	public RSPGame() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		// 상단 패널
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GRAY);
		
		for(int i = 0; i < 3; i++) {
			imageicon[i] = new ImageIcon(s[i] + ".png");
			jb[i] = new JButton(imageicon[i]);
			panel1.add(jb[i]);
			jb[i].addActionListener(this);
		}
		
		// 중단 패널
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		me = new JLabel();
		com = new JLabel();
		result = new JLabel();
		result.setForeground(Color.red);
		panel2.add(me);
		panel2.add(com);
		panel2.add(result);
		
		ct.add(panel1, BorderLayout.NORTH);
		ct.add(panel2, BorderLayout.CENTER);
		
		setTitle("가위 바위 보 게임");
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		JButton btn = (JButton)ae.getSource();
		int user_num;
		if(jb[0] == btn) {
			user_num = 0;	// 가위
		}
		else if(jb[1] == btn) {
			user_num = 1;	// 바위
		}
		else {
			user_num = 2;	// 보
		}
		
		int com_num = (int)(Math.random() * 3);
		System.out.println(user_num + "\t" + com_num);
		
		me.setIcon(imageicon[user_num]);
		me.setText("me");
		com.setIcon(imageicon[com_num]);
		com.setText("com");
		
		if(user_num == com_num) {
			result.setText("Same!!!");
		}
		else if(user_num == (com_num + 1) % 3) {
			// 0은 1한테 지고, 1은 2한테, 2는 0한테 짐
			result.setText("ME!!!");
		}
		else {
			result.setText("Computer!!!");
		}
	}
	
}


public class RSPGameTest {
	public static void main(String[] args) {
		new RSPGame();

	}

}
