package page413;

public class A {
	
	public static void main(String[] args) {
		//B b = new B();
		C c = new C();
		c.method();
	}
	
	
	int field1;
	void method1() {
		System.out.println("method1()");
	}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			System.out.println("method()," + field1);
			
			field2 = 10;
			method2();
			
		}
	}
	
	static class C{
		void method() {
//			field1 = 10;
//			method1();
			
			field2 = 10;
			method2();
			System.out.println(field2);
		}
	}
}
