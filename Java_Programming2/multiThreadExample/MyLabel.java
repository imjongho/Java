package multiThreadExample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyLabel extends JLabel {
	private int barSize = 0;
	private int maxBarSize;
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double) (this.getWidth())) / maxBarSize*barSize);
		if(width==0)
			return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized public void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				return;
			}
		}
		barSize++;
		repaint();
		notify();
	}
	
	synchronized public void consume() {
		if(barSize == 0) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint();
		notify();
	}
}



class ConsumerThread extends Thread {
	private MyLabel bar;
	
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}













