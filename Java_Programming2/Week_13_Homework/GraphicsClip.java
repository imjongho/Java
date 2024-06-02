package Week_13_Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsClip extends JFrame {
	
	private ClipPanel clipPanel = new ClipPanel();
	
	public GraphicsClip() {
		setContentPane(clipPanel);
		
        setTitle("Java2_Week_13_2");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
		
        // 키 리스너 추가
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                clipPanel.moveClip(e.getKeyCode());
            }
        });
	}
	
	
    class ClipPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("D:/Java/eclipse-workspace/Java_Programming2/src/Week_13_Homework/clipImage.jpg"); // 이미지 로딩
        private Image img = icon.getImage();
        private int clipX = 0, clipY = 0; // 클리핑 영역의 시작 위치

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setClip(clipX, clipY, 50, 50); // 클리핑 영역 지정, 클리핑 영역 크기 50, 50
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this); // 배경 이미지를 패널 전체에 그리기
        }

        public void moveClip(int keyCode) {
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    clipX = Math.max(0, clipX - 10);
                    break;
                case KeyEvent.VK_RIGHT:
                    clipX = Math.min(getWidth() - 50, clipX + 10);
                    break;
                case KeyEvent.VK_UP:
                    clipY = Math.max(0, clipY - 10);
                    break;
                case KeyEvent.VK_DOWN:
                    clipY = Math.min(getHeight() - 50, clipY + 10);
                    break;
            }
            repaint();
        }
    }

	
	public static void main(String[] args) {
		new GraphicsClip();
	}

}
