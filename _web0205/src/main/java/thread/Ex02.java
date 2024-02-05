package thread;

public class Ex02 {
	public static void main(String[] args) {
		Task task = new Task();
		Thread th = new Thread(task); //다른코어의 흐름을 만들겠다 thread를 만들어 따로 돌리겠다
		th.start();
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
