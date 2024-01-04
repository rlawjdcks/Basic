package sec02.exam01;

public class Operator {

	public static void main(String[] args) {
		
		
		System.out.println(0.1 == 0.1f); // float는 정확한게아님 앞의 0.1은 double
		System.out.println(3 == 3.0);
		System.out.println('A' == 65);
		
		
		int num2 = 'B' - 'a';
		System.out.println(num2);
		
		System.out.println(65<66);
		
		String string = "JDK" +  (3 + 3.0); //JDK6.0
		System.out.println(string);
		
		
		
		for (int i = 0; i <= 10; i++) {
			char c1 = (char) ('A' + i);
			System.out.println(c1);
		}
		
		
		
		
		for (int i = 1; i <= 10; i++) {
			if ( i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
		int x = 10%3;
		System.out.println(x);
		
		boolean play = true;
		System.out.println(!play);
		
		
		byte b = 100;
//		byte result = -b; // -1 * b => 연산결과가 정수로 바껴서 int임 byte아님
		
	}

}
