package sec01.exam2;

public interface InterTest {
	//객체생성불가
	//변수선언 가능
	//인터페이스끼리는 extends 상속을 사용
	void test();// 추상메소드
	default void test1() { // 메소드 재정의 안해도 됨,몸통("{}"을가짐) 오래 지나서 새롭게 추상메소드 넣을때 편리할듯
		System.out.println("test1()");
		test4();
	}
	private void test4() { // 메소드 재정의 안해도 됨,몸통("{}"을가짐),인터페이스 내 다른 메소드들이 호출가능
		System.out.println("gg");
	};
	static void test5() {  // 메소드 재정의 안해도 됨,몸통("{}"을가짐), 그냥 static 메소드 아무대나 갖다 쓰면 댐
		System.out.println("hg");
	}
	
}
