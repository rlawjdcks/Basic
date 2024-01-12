package sec02.exam03;

class MyClass{
	
	void method1() {
		System.out.println(this.toString());
		System.out.println("method1");
	}
	static void method2() {
		System.out.println("method2");
		
	}
}


public class StaicClass {
	static void method3() {
		System.out.println("method3");
	}
	public static void main(String[] args) {
		MyClass.method2();
		StaicClass.method3();
		
		MyClass myC = new MyClass();
		myC.method1();
		myC.method2();
		MyClass myC2 = new MyClass();
		myC2.method1();
		myC2.method2();
		
	}

}
