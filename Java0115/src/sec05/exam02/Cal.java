package sec05.exam02;

public class Cal {
	
	static int x;
	static int p1() {
		return x + 100;
	}
	static int m1() {
		return x - 100;
		
	}
	static void m2() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Cal ca = new Cal();
		ca.m2();//되긴하지만 정상적인용법아님
		
		x = 100;
		int y = p1();
		System.out.println(y);
		Cal.m2();
	}

}
