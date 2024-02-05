package thread;

public class Ex04 {

	public static void main(String[] args) {
		WorkerThread wt = new WorkerThread();
		wt.start();
		mainTask();
	}
	public static void mainTask() {
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
