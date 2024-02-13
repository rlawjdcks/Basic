package sec01.verify.exam02;

import java.util.Iterator;

public class MovieThread extends Thread {

	public MovieThread() {
		this.setName("movie");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
