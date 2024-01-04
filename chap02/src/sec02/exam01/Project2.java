package sec02.exam01;

import java.util.Scanner;

public class Project2 {
	
	private static String name1;
	private static int number1;
	private static int number2;
    private static boolean loggedIn = false; // 로그인 상태를 나타내는 변수

	//로그인 
	
	
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("아이디");
				String nameString = scanner.nextLine();
				System.out.println("주민번호");
				String strPassword = scanner.nextLine();
				int password = Integer.parseInt(strPassword);
				
				
				if (nameString.equals(name1)) {
					if (password == number1) {
						System.out.println("로그인함");
						loggedIn = true;
					}
					else {
						System.out.println("실패");
					}
				} else {
					System.out.println("아이디안댐");
				}
			
				break;
			case 2:
				System.out.println("이름");
				String name = scanner.nextLine();
				name1 = name;

				
				System.out.println("주민번호");
				String number13 = scanner.nextLine();
				number1 = Integer.parseInt(number13);
				
				System.out.println("전화번호");
				String number41 = scanner.nextLine();
				number2 = Integer.parseInt(number41);
				
			//	System.out.println("입력한내용");
			//	System.out.printf("%s\n%d\n%d",name,number1,number2);
				System.out.println("회원 가입");
				break;
			case 3:
				if (loggedIn == false) {
					System.out.println("로그인이 안되어있음");
					break;
				}
				
				boolean run1 = true;
				int balance = 0;
				
				while (run1) {
					System.out.println("----------------------------------");
					System.out.println("1.예금 | 2.출금 |3.잔고 |4.상위메뉴");
					System.out.println("----------------------------------");
					System.out.println("선택");
					int num1 = Integer.parseInt(scanner.nextLine());
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
					} else if (num1 == 4 ) {
						System.out.println("선택>4");
						System.out.println("상위메뉴");
						run1 = false;
						break;
					}

					
				}
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}