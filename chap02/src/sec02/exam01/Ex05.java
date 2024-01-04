package sec02.exam01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 |3.잔고 |4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택");
			int num1 = scanner.nextInt();
			int put =0;
			int min =0;
			
			if (num1 == 1) {
				System.out.println("선택> 1");
				System.out.print("예금액은>");
				put = scanner.nextInt();
				balance = balance + put;
			} else if (num1 == 2 ) {
				System.out.println("선택>2");
				System.out.print("출금액>");
				min = scanner.nextInt();
				balance = balance - min;

			} else if (num1 == 3 ) {
				System.out.println("선택>3");
				System.out.println("잔고는>" + balance);
			} else if(num1 == 4 ) {
				System.out.println("선택>4");
				System.out.println("프로그램종료");
				break;
			}

			
		}
		
	}

}
