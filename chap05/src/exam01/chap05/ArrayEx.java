package exam01.chap05;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

//		int[] score = {12, 12 ,54};
//		System.out.println(score.length);
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열 수 : ");
		int num = scanner.nextInt();
		
		
		int[] score = new int[num]; //힙 영역 생성 개수
		score[0] = 1;
		score[1] = 11;
		score[2] = 12;

		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		
		String str = "abc";
		System.out.println(str.length());
		
		
		String[] names = new String[3];
		names[0] = "머";
		for (int i = 0; i <names.length; i++) {
			System.out.println(names[i]);
		}
		
		
	}


}
