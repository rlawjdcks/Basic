package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener, MouseListener {
	JButton jb = new JButton("버튼");
	JButton jb2 = new JButton("버튼2");

	public MyFrame2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();// 컴포넌트 붙임 버튼 등
		this.setVisible(true);
		this.setSize(900, 500);
		this.setLocation(200, 100);
		this.setTitle("이벤트");

		con.addMouseListener(this);
		con.setLayout(new FlowLayout());
		con.add(this.jb);
		jb.addActionListener(this);
		con.add(this.jb2);
		jb2.addActionListener(this);
	}

	public static void main(String[] args) {
		new MyFrame2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			System.out.println("버턴1");
		}else if (e.getSource() == jb2) {
			System.out.println("버턴2");
			
		}
	}
  
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() +","+e.getY());		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
