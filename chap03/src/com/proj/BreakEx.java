package com.proj;

public class BreakEx {

	public static void main(String[] args) {

		System.out.println("G");
		
		for (int i = 0; i < 100; i++) {
			if (i ==55) {
				//break; //루프를 빠져나감 - G아래로 for문 밖으로 System.out.println(i); 하지않고 바로 나감 
				continue;// for문 시작점으로 감 하지만 continue 가 있던 if문을 빼고감
			}
			System.out.println(i);
			
		}
		System.out.println("종료");
	}

}
