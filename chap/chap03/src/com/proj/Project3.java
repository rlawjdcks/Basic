package com.proj;

import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		String memberNameString = "admin";//회원이름
		String memberNameSSN = "1111";//생년월일 패스워드
		String memberNameTel = "";//전화번호
		boolean login = false; //로그인여부
		boolean membershipStatus = false; //회원가입여부
		int balance = 0; //은행잔고
		
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
				if (login) {
					
					System.out.println("이미로그인");
					//switch 에서의 break 는 switch문에서는 멈추는느낌이고 for문은 탈출느낌
					//break;
					continue; // 얘는 반복문 처음으로 간다
				}
				
				
				System.out.println("로그인 처리");
				
				System.out.print("아이디:");  //출력문
				String name = scanner.nextLine(); // name 변수의 값 입력
				System.out.print("패스워드:");
				String strPassword = scanner.nextLine();//패스워드입력
				//int password = Integer.parseInt(strPassword); // stpassword값을 정수로 변환
				if (name.equals(memberNameString)) {
					if (strPassword.equals(memberNameSSN)) {
						System.out.println("로그인 성공");
						login = true;
					} else {
						System.out.println("로그인 실패:패스워드가 틀림");
					}
				} else {
					System.out.println("로그인 실패:아이디 존재하지 않음");
				}
				break;
			case 2:
				// 회원 가입
				
				if (membershipStatus) {
					System.out.println("이미가입임");
					System.out.println("회원이름은 : " + memberNameString);
					System.out.println("또 가입 할꺼?(Y/N)");
					String pressKey = scanner.nextLine();
					
					 if (pressKey.equals("Y")) {
						
						 System.out.println("회원 가입");
						 
						 System.out.println("[필수 정보 입력]"); 
						 System.out.print("1. 이름: ");
						 memberNameString = scanner.nextLine(); 
						 System.out.print("2. 주민번호 앞 6자리: ");
						 memberNameSSN = scanner.nextLine(); 
						 System.out.print("3. 전화번호: "); 
						 memberNameTel = scanner.nextLine();
						 
						 membershipStatus = true;
						 
						 System.out.println("회원가입 완료");
						 System.out.println();
						 System.out.println("[입력된 내용]");
						 System.out.println("1. 이름: " + memberNameString);
						 System.out.println("2. 주민번호 앞 6자리: " + memberNameSSN); 
						 System.out.println("3. 전화번호: " + memberNameTel);

				 		 break;
						
					}
					 else if(pressKey.equals("N")) {
						
						break;
						
					}
				}
				 System.out.println("회원 가입");
				 
				 System.out.println("[필수 정보 입력]"); 
				 System.out.print("1. 이름: ");
				 memberNameString = scanner.nextLine(); 
				 System.out.print("2. 주민번호 앞 6자리: ");
				 memberNameSSN = scanner.nextLine(); 
				 System.out.print("3. 전화번호: "); 
				 memberNameTel = scanner.nextLine();
				 
				 membershipStatus = true;
				 
				 System.out.println("회원가입 완료");
				 System.out.println();
				 System.out.println("[입력된 내용]");
				 System.out.println("1. 이름: " + memberNameString);
				 System.out.println("2. 주민번호 앞 6자리: " + memberNameSSN); 
				 System.out.println("3. 전화번호: " + memberNameTel);
				 break;
			
					// y를 눌렀을때 , n을 눌렀을 때
				
				
				
			case 3:
				// 예금 출금
				if (login == false) {
					System.out.println("로그인해줘");
					break;
				} 
				
				System.out.println("예금 출금");
				boolean run2 = true;

				
				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.상위메뉴");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				}
				System.out.println("프로그램 종료");
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
