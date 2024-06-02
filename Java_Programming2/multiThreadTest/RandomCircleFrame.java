package multiThreadTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class CirclePanel extends JPanel implements Runnable {
    private int x = 100;
    private int y = 100;

    public CirclePanel() {
        this.setPreferredSize(new Dimension(300, 300)); // 패널의 크기 설정
        this.addMouseListener(new MouseAdapter() {
            private Thread th = null;

            @Override
            public void mousePressed(MouseEvent e) {
                if (th == null) {
                    th = new Thread(CirclePanel.this);
                    th.start();
                }
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.drawOval(x, y, 50, 50);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }

            x = (int) (Math.random() * this.getWidth());
            y = (int) (Math.random() * this.getHeight());
            repaint();
        }
    }
}

public class RandomCircleFrame {

    public RandomCircleFrame() {
        JFrame frame = new JFrame("Random Circle Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CirclePanel());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RandomCircleFrame();
    }
}

