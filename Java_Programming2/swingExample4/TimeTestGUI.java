package swingExample4;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyTime extends JFrame implements ActionListener {

	private JTextField jtf;
	private JTextArea jta1;
	private JTextArea jta2;
	private JLabel jl = new JLabel("당신의 생일을 공백으로 구분하여 입력(예: 2020 01 01)");
	
	public MyTime() {
		JButton jb1 = new JButton("현재");
		JButton jb2 = new JButton("100살");
		jtf = new JTextField(10);
		jta1 = new JTextArea(4, 20);
		jta2 = new JTextArea(3, 20);
		jta1.setEditable(false);
		jta2.setEditable(false);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.add(jl);
		p1.add(jtf);
		p2.add(jb1);
		p2.add(jta1);
		p3.add(jb2);
		p3.add(jta2);
		
		ct.add(p1);
		ct.add(p2);
		ct.add(p3);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		setTitle("JTextField, JTextArea Test1");
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String birth = jtf.getText();
		StringTokenizer st1 = new StringTokenizer(birth);
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		LocalDate my_birth = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();
		LocalDate hundred = my_birth.plusYears(100);
		
		if(ae.getActionCommand() == "현재") {
			jta1.append("당신의 생일 : " + toString(my_birth) + "\n");
			jta1.append("오늘 날짜는 : " + toString(current) + "\n");
			jta1.append("생일부터 오늘까지의 일 : " + my_birth.until(current, ChronoUnit.DAYS) + "\n");
			jta1.append("생일부터 오늘까지의 년 : " + my_birth.until(current, ChronoUnit.YEARS));
		}
		else {
			jta2.append("당신이 100이 되는 날은 : " + toString(hundred) + "\n");
			jta2.append("100살까지 남은 주(week) 수 : " + current.until(hundred, ChronoUnit.WEEKS) + "\n");
			jta2.append("100살까지 남은 일 수 : " + current.until(hundred, ChronoUnit.DAYS));
		}
	}
	
	public static String toString(LocalDate d) {
		return d.getYear() + "년 " + d.getMonthValue() + "월 " + d.getDayOfMonth() + "일";
	}
	
}


public class TimeTestGUI {
	public static void main(String[] args) {
		new MyTime();
		
	}

}
