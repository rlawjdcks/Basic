package sec02.exam01;

public class LoopEx {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int k = 0;
		for (;k<10;) {
			System.out.println(k);
			k++;
		}
		
		int i = 0;
		while ( i < 10) {
			System.out.println(i);
			i++;
		}
		
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while ( j < 10);
		
	}

}
