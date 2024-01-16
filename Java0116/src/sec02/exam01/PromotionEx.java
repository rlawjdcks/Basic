package sec02.exam01;

class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionEx {
	public static void main(String[] args) {
		Object obj = new A(); //Object 얘는 최고조상이라 자식으로 객체 다됨
		
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		//A a2 = new c(); 이것도 가능 부모로 변수선언, 자식으로 객체생성
		// 부모로 변수선언, 자식으로 객체생성 되는것이 자동 타입변환임
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e; 얘네 둘은 상속관계를 안해서 불가능임
		//C c2 = d;
		
	}
}
