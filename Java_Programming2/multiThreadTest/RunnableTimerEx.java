package multiThreadTest;
import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;	// 타이머 값을 출력할 레이블
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;	// 타이머 카운트를 출력할 레이블
	}
	
	// 스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		while(true) {
			Calendar cal = Calendar.getInstance();
			
			int hour = cal.get(Calendar.HOUR);
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);
			String now = hour + ":" + minute + ":" + second;
			timerLabel.setText(now);	// 레이블에 카운트 값 출력

		}
	}
	
}


public class RunnableTimerEx extends JFrame {
	
	public RunnableTimerEx() {
		setTitle("디지털 시계");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		// 타이머 스레드로 사용할 Runnable 객체 생성, 타이머 값을 출력할 레이블을 생성자에 전달
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);

		setSize(400, 200);
		setVisible(true);
		
		th.start();	// 타이머 스레드의 실행
	}

	public static void main(String[] args) {
		new RunnableTimerEx();
	}

}
