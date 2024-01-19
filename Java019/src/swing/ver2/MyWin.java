package swing.ver2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame {
	JLabel lb1 = new JLabel("이름");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("버튼1");
	JLabel lb2 = new JLabel("이름");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("버튼1");
	public MyWin() {
		Container con = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 500);  // 크기 설정
		this.setLocation(200, 100);
		this.setVisible(true);  
		this.setTitle("자바 스윙");
		con.setLayout(new FlowLayout());
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		
	}

	
	public static void main(String[] args) {
		new MyWin();
	}


}
