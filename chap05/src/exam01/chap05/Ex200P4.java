package exam01.chap05;

import java.util.Iterator;
import java.util.Scanner;

public class Ex200P4 {

	public static void main(String[] args) {
		
		int max = 0;
		int index = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력할 개수 : ");
		
		int count = scanner.nextInt();
		
		int[] intNum = new int[count];
		
		for (int i = 0; i < intNum.length; i++) {
			System.out.println("정수 입력 : ");
			//입력
			intNum[i] = scanner.nextInt();
		}
		for ( int maxi : intNum) {
			if ( max < maxi) {
				max = maxi;
			}
		}
		System.out.println("max" + max);
		
		//최대값 구해서 출력
		
		
		
		
		
		int[] array = {1,5,3,8,2};
		int i = 0;
		for (int num : array) {
			if (max < num) {
				max = num;
				index = i;
			}
			i++;
		}
		
//		for (int i = 0; i < array.length; i++) {
//			
//				if (max < array[i]) {
//					max = array[i];
//					index = i;
//				}
//		}

		
		
		System.out.println("최대값 : " + max);
		System.out.println("인덱스 : " + index);
	}
}
