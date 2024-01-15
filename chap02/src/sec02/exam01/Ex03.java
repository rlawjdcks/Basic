package sec02.exam01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int x=5,y=0,z=0;
		y= x++;
		z=--x;
		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
		
		
		//회원가입 기능으로
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		System.out.println("입력한내용");
		System.out.printf("%s\n%d\n%d",name,number1,number2);
		
	}

}
