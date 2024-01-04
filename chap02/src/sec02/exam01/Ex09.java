package sec02.exam01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			
			
			
			double number1 = scanner.nextDouble();
			
			double number2 = scanner.nextDouble();
					
			if (number2 == 0 || number2 == 0.0) {
				System.out.println("무한ㅁ"); 
			} else {
				double result = number1/number2;

				System.out.println("나눈값" + result);
			}
			
		
	}

}
