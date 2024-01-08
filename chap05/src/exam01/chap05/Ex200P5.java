package exam01.chap05;

import java.util.Iterator;

public class Ex200P5 {

	public static void main(String[] args) {
		double array[] = new double[] { 105.324, 2078.85 , 307.23, 40,};
		double sum = 0;
		double avg = 0;
		
		//총점 평균
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
		sum = 0;
		
		for (double num : array) {
			sum += num; 
		}
		avg = (double) sum/array.length;
		System.out.println(avg);
		
	}

}
