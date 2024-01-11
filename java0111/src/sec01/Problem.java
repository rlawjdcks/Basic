package sec01;

import java.util.Iterator;

public class Problem {

	public static void main(String[] args) {

		int a[] = {1,3,10,2,8};
		int sum = 0; 
		int n = 0; 
		double avg = 0; 

		//1
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("1.합" + sum);
		
		
		
		
		
		//2
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
		avg = (double) sum/a.length;
		System.out.println("2.평균" + avg);
		
		
		
		
		
		
		//3
		for (int i = 0; i < a.length; i++) {
			if (a[n]<a[i]) {
				n = i;
			}
		}
		System.out.println("3.최대값 : " + a[n]);
	
		
		
		
		
		
		//4
		int b[] = {10,3,1,4,2};
		int idx = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] ==4 ) {
				idx = i;
			}
		}
		System.out.println("4."+idx);
		
		
		
		//자료교환
		int x = 10;
		int y = 200;
		int temp = 0;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("자료교환 문제 :x값" +x +"y값"+ y );
		
		
		
		
		
		
		
		
		//int a[] = {1,3,10,2,8,32}; 5
		
		System.out.print("5번");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j+1]) {//3( 1 3 10 2 8 32)
					b[i] = a[j];
					a[j]= a[j+1];
					a[j+1] = b[i];
				}
			}
			System.out.print(+a[i]+",");
		}
		
	}

}
