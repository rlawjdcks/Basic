package sec02.exam01;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class SumEx {

	
	
	
	
	
	private static int multi(int num1,int num2) { // 1.왜 매개변수에 scanner - 매개 변수도 약간은다르지만 선언느낌이 된다
		 int result = num1 * num2;
		 System.out.println("곱셈 결과:" + result);
		 return result;
	}
	
	
	private static void sum(int num1,int num2) { // static 정적메소드 
		 int result = num1 + num2;
		 System.out.println("덧셈 결과:" + result);
	}
	
	public static void main(String[] args) { //실행
		Scanner scanner = new Scanner(System.in);
		 System.out.print("첫번째 수:");
		 String strNum1 = scanner.nextLine();
		 System.out.print("두번째 수:");
		 String strNum2 = scanner.nextLine();
		 int n1  = Integer.parseInt(strNum1);
		 int n2 = Integer.parseInt(strNum2);

		sum(n1, n2);
		multi(n1 , n2);
		
	}

}
