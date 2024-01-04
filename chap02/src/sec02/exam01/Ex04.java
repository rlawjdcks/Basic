package sec02.exam01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//로그인 기능으로
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디");
		String nameString = scanner.nextLine();
		System.out.println("패스워드");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		
		
		if (nameString.equals("java")) {
			if (password == 12345) {
				System.out.println("성공");
			}
			else {
				System.out.println("실패");
			}
		} else {
			System.out.println("아이디안댐");
		}
		
		
	}

}
