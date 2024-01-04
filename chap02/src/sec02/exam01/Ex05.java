package sec02.exam01;

import java.util.Scanner;

public class Ex05 {
 
	public static void main(String[] args) {
		//입출금으로

		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------------");
			System.out.println("111.예금 | 222.출금 |333.잔고 |444.종료");
			System.out.println("----------------------------------");
			System.out.println("선택");
			int num1 = scanner.nextInt();
			int put =0;
			int min =0;
			
			if (num1 == 111) {
				System.out.println("선택> 111");
				System.out.print("예금액은>");
				put = scanner.nextInt();
				balance = balance + put;
			} else if (num1 == 222 ) {
				System.out.println("선택>222");
				System.out.print("출금액>");
				min = scanner.nextInt();
				balance = balance - min;

			} else if (num1 == 333 ) {
				System.out.println("선택>333");
				System.out.println("잔고는>" + balance);
			} else if(num1 == 4 ) {
				System.out.println("선택>444");
				System.out.println("상위 메뉴로");
				break;
			}

			
		}
		
	}

}
