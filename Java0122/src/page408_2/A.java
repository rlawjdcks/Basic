package page408_2;

public class A {
	static class C{
		C() {}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void methodA() {
		C c = new C();
		c.field1 = 3;
		C.field2 = 10;
		
	}
}
