package sec01.verify.exam02;

public class ThreadEx {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		Thread thread2 = new Thread(new Music());
		thread2.setName("music");
		thread2.start();
	}

}
