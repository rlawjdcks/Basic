package thread;

import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("start");
		for (int i = 0; i < 5; i++) {
			System.out.println("start");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("end");
	}

}
