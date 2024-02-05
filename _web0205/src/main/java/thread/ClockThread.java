package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;

public class ClockThread implements Runnable{
	JFrame df;
	
	
	ClockThread(JFrame df) {
		this.df=df;
	}
	@Override
	public void run() {
		System.out.println(LocalDateTime.now());
		for (;;) {
			LocalDateTime localDateTime = LocalDateTime.now();
			String localDateTime1 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
			System.out.println(localDateTime1);
			df.setTitle(localDateTime1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
