package sec02.exam03;

public class Computer {
	
	
	int sum1(int[] values) {
		int sum= 0;
		
		
//		for (int i = 0; i < values.length; i++) {
//			sum += values[i];
//		}
//		return sum;
		
		
		for (int each : values) {
			sum += each;		
			}
		return sum;
		
	}
	
	
	int sum2(int ... values) {
		int sum= 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
		
	}
}
