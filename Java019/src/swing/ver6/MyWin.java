package swing.ver6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyWin extends JFrame {
	JLabel lb1 = new JLabel("이름");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("버튼1");
	JLabel lb2 = new JLabel("이름2");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("종료버튼");
	
	public MyWin() {
		Container con = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("aas");
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();
				
			}
		});
//		파일읽기 작업
		JOptionPane.showMessageDialog(this, "파일읽었어!", "파일읽기",JOptionPane.INFORMATION_MESSAGE);
	}

	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, "종료할래?", "confirm",JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			System.out.println("종료할게");
			System.exit(0);
		} else {
			System.out.println("종료취소");
		}
		
	}
	
	public static void main(String[] args) {
		new MyWin();
	}


}
