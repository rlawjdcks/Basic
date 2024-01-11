package sec01;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("행입력");
		int hang = scanner.nextInt();
		System.out.println("열입력");
		int yel = scanner.nextInt();
		int[][] arr = new int[hang][yel];
		
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				System.out.printf("(%d, %d) : " , j,i);
				arr[j][i] = scanner.nextInt();
				
			}
		}
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				sum += arr[j][i];
			}
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (double)sum/(hang*yel));

	}

}
