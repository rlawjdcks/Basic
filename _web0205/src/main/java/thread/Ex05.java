package thread;

public class Ex05 {

	public static void main(String[] args) {

		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Task start");
				for (int i = 0; i < 5; i++) {
					System.out.println("Task 진행");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				System.out.println("Task end");
			}
		};
		
		thread.start();
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