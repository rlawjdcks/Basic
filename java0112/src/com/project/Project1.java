package com.project;

import java.util.Scanner;

public class Project1 {
	
	static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void disp1() {
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
	}
	
	public static void disp2() {
		System.out.println("-------------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.상위메뉴");
		System.out.println("-------------------------------------");
	}
	
	public static void menu2(Session session) {
		//boolean run = true;
		while (session.isRun2()) {
			disp2();
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("예금");
				break;
			case 2:
				// 회원 가입
				System.out.println("출금");
				break;
			case 3:
				// 예금 출금
				System.out.println("잔고");
				break;
			case 4:
				//session.run = false;
//				session.setRun2(false);
				session.setMenuState(MenuState1.DEPOSIT_EXIT);
				System.out.println("상위메뉴");
				
				break;
			}
		}
	}
	
	
	public static void menu1(Session session) {
		//boolean run = true;
		while (session.isRun()) {
			disp1();
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("로그인 처리");
				break;
			case 2:
				// 회원 가입
				System.out.println("회원 가입");
				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				if (session.getLoginInfo() != null) { //로그인 정보가 null이 아니라면
//					session.setRun2(true);
					session.setMenuState(MenuState1.DEPOSIT);
					menu2(session);
				}
				break;
			case 4:
				//session.run = false;
//				session.setRun(false);
				session.setMenuState(MenuState1.TOP_EXIT);
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		LoginInfo loginInfo = new LoginInfo("id","pass");//null 넣어도되는이유
		//여기에서 null은 null을 해도 초기값으로 null처리가 된것 이유는 생성자 초기화느낌
		
		
		Session session = new Session(true,false,loginInfo);
		//여기에서의 null은 메소드 안의 값 자체가 null이라 여기서 null이면 안댐

		
		menu1(session);
		
	}
}























