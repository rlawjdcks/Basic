package swing.ver1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame {
	public MyWin() {
		Container con = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 500);  // 크기 설정
		this.setLocation(200, 100);
		this.setVisible(true);  
		this.setTitle("자바 스윙");
		con.setLayout(null);
		
		
	}

	
	public static void main(String[] args) {
		new MyWin();
	}



}
