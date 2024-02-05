package thread;

public class WorkerThread extends Thread{
	//이미 상속을받아서 상속을 또 못받음
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
	
}
