package sec02.exam01;

import java.util.Scanner;

public class Sum {

	
	private static void multi(Scanner scanner) { // 1.왜 매개변수에 scanner - 매개 변수도 약간은다르지만 선언느낌이 된다
		System.out.print("첫번째 수:");
		 String strNum1 = scanner.nextLine();
		 System.out.print("두번째 수:");
		 String strNum2 = scanner.nextLine();
		 int num1 = Integer.parseInt(strNum1);
		 int num2 = Integer.parseInt(strNum2);
		 int result = num1 * num2;
		 System.out.println("곱셈 결과:" + result);
		
		
	}
	
	
	private static void sum(Scanner scanner) { // static 정적메소드
		 System.out.print("첫번째 수:");
		 String strNum1 = scanner.nextLine();
		 System.out.print("두번째 수:");
		 String strNum2 = scanner.nextLine();
		 int num1 = Integer.parseInt(strNum1);
		 int num2 = Integer.parseInt(strNum2);
		 int result = num1 + num2;
		 System.out.println("덧셈 결과:" + result);
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		sum(scanner);
		multi(scanner);
		
	}

}
