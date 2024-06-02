package Week_13_Homework;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.net.*;
import javax.swing.*;


class ClientGUI extends JFrame {
	
    private JTextField studentNameField;
    private JLabel gradeLabel;
    
    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;

    public ClientGUI() {
        createGUI();
        addActionEvents();
        connectToServer();
    }
    

    private void createGUI() {
        studentNameField = new JTextField(7);
        gradeLabel = new JLabel("점수");

        JPanel panel = new JPanel();
        panel.add(new JLabel("이름 입력 "));
        panel.add(studentNameField);
        panel.add(gradeLabel);

        this.add(panel);
        this.setTitle("Java2_Week_13_1 클라이언트");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    
    private void addActionEvents() {
    	// 필드 입력하고 엔터 누르면 서버에서 체크해서 성적을 알려줌
        studentNameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                	sendNameToServer(studentNameField.getText());
                }
            }
        });
    }
    
    
    private void connectToServer() {
        try {
            socket = new Socket("localhost", 9999);
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    // 이름 입력 후, 엔터 누르면 학생 이름을 서버한테 보냄
    private void sendNameToServer(String name) {
        try {
            if (name.equals("bye")) {
                closeWindow(); // 'bye' 입력 시 창을 닫음
                return;
            }
        	
            out.write(name);
            out.newLine();
            out.flush();

            String grade = in.readLine();        
            gradeLabel.setText("성적 " + grade);
        } catch (IOException e) {
            gradeLabel.setText("Error: " + e.getMessage());
        }
    }
    
    
    private void closeWindow() {
        try {
            if (out != null) {
                out.write("bye\n");
                out.flush();
            }
            if (socket != null) socket.close();
            if (in != null) in.close();
            if (out != null) out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        dispose();
    }
    
    
}




public class Client {
    public static void main(String[] args) {
    	new ClientGUI();
    }
}








