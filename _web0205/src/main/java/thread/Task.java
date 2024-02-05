package thread;

public class Task implements Runnable{
	//상속을 받지 않아서 다시 사용하기 더 불편해도 추후 상속 받을 수 있음
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
