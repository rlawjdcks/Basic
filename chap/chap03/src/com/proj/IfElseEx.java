package com.proj;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		int score = scanner.nextInt();
		
//		if (score >= 90) {
//			System.out.println("점수가 100~ 90입니다");
//			System.out.println("등급 A");
//		} else if(score >=80){
//			System.out.println("등급 b");
//
//		} else if(score >=80){
//			System.out.println("등급 c");
//
//		} else {
//			System.out.println("등급 d");
//
//		}

		
			switch (score/10) { //switch 에서의 break 는 switch문에서는 멈추는느낌이고 for문은 탈출느낌
			
			case 9, 10:
				System.out.println("등급 A");
				break;
			case 8:
				System.out.println("등급 b");
				break;
			case 7:
				System.out.println("등급 c");
				break;
			default:
				System.out.println("등급 d");
				break;
			}
			
		


		
	}

}
