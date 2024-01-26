package sec01.exam01;

import java.util.Iterator;

public class Exit {
	public static void main(String[] args) {

		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) {
//				break;
				System.exit(0);
				
			}
		}
		System.out.println("종료");
	}
}
