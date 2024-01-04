package sec02.exam01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 입력을 위한 준비
		String str;

		int cnt = 0;
		for (;;) {

			int ran1 = (int) (Math.random() * 9) + 1;
			int ran2 = (int) (Math.random() * 9) + 1;
			System.out.printf("%d X %d =", ran1, ran2);
			int ran12 = 0;
			ran12 = ran1 * ran2;
			int num1 = scanner.nextInt(); // 입력

			if (cnt == 4) {
				break;
			}

			if (ran12 == num1) {
				System.out.println("정답입니다");
				cnt++;
			} else {
				System.out.println("틀렸습니다 다시 입력하세요");
			}

		}
		System.out.println("종료");

	}

}
