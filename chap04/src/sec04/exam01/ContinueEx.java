package sec04.exam01;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[] {1,2,3,4,5};
		
		//배열 생성하는걸 두개로 나눠서 적는걸 알아야한다
		//선언과 초기화를 나눠야 할 경우가 꽤 많음
		int[] arr2 = null;
//		arr2 = new int[size];
		
		
		System.out.println("크기 ");
		int size = scanner.nextInt();
		arr2 = new int[size];
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
