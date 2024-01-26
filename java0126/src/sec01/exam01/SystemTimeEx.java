package sec01.exam01;

public class SystemTimeEx {

	public static void main(String[] args) {
		long time = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i < 100000; i++) {
			sum +=i;
		}
		long time2 = System.nanoTime();
		System.out.println("1~100000합 : " + sum);
		System.out.println("연산시간 : " +(time2-time) +"나노초");
		
	}

}
