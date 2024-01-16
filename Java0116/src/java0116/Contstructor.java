package java0116;

class A {
	public A() {
		System.out.println("생성자A");
	}
}
class B extends A {
	public B() {
		System.out.println("생성자B");
	}
}
class C extends B {
	public C() {
		System.out.println("생성자C");
	}
}

public class Contstructor {

	public static void main(String[] args) {
		A asA = new A();
		B asB = new B();
	
		C c = new C();
	}

}
