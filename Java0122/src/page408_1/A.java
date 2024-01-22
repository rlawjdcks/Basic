package page408_1;

public class A {
	static int field3;
	
	class B{
		B() {}
		int field;
//		static int field2;// 오류임  static는 바로 이용할수있는데 객체생성이 안되서
		void method1() {}
//		static void method2() {}
		
	}
	void methodA() {
		B b = new B();
		b.field = 3;
		b.method1();
		
	}
}
