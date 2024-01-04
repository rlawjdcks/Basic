package sec02.exam01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		System.out.println("입력한내용");
		System.out.printf("%s\n%d\n%d",name,number1,number2);
		
	}

}
