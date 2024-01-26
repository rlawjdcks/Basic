package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class MyFrameSample extends JFrame {
	public MyFrameSample() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		this.setLocation(400, 100);
		this.setSize(800, 800);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrameSample();
	}
}