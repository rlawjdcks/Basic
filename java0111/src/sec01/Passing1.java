package sec01;

public class Passing1 {

	//지역변수는 그 블럭에서만 생존
	public static void main(String[] args) {
		int x = 100; //지역변수
		int num = method1(x); // (호출 메서드 이름으로 실행)
		System.out.println(num);
		System.out.println(x);
	}
	
	public static int method1(int y) {//함수 , 메서드
		// y도 지역변수 (단 호출한곳에서 값을 넘겨줘야함)
		y += 1;
		return y;
	}

}
