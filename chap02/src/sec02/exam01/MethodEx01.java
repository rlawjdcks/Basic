package sec02.exam01;

import java.util.Iterator;
import java.util.Scanner;

public class MethodEx01 {
	
	
	
	private static int ranNumber() {
		
		return (int)(Math.random() * 9) +1;
		
	}
	
	
	private static void multiplication() {
		
		Scanner scanner = new Scanner(System.in); //입력을 위한 준비
		String str;
		
		for (;;) {
			
			int ran1 = ranNumber();
			int ran2 = (int) (Math.random() * 9) + 1;
			System.out.printf("%d X %d =", ran1 , ran2);
			int ran12 = 0;
			ran12 =ran1 * ran2;
			int num1 = scanner.nextInt(); //입력
			
			
			if(ran12 == num1 ) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("틀렸습니다 다시 입력하세요");
			}
			
			
			
			
		}
	}
	

	public static void main(String[] args) {
		for (int i = 0; i <3; i++) {
			
			multiplication();
			
		}
		
		System.out.println("종료");
		
		
	}

}
