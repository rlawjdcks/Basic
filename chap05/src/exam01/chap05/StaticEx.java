package exam01.chap05;

public class StaticEx {
	
	static int y; //정적 필드
	//public static int x = 100; 
	
	
	
	public static void main(String[] args) {
		System.out.println(y);
		int x = 100; // 지역변수
		m1(100);
	}
	
	public static void m1(int x) {//매개변수 (일종의 지역변수)
		System.out.println(y);
		System.out.println(x);
	}
}
