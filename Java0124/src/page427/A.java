package page427;


class Parent{
	void parentMethod() {}
}

public class A {
	Parent field = new Parent() {
		int childField;
		void childMethod() {}
	};// 필드 : Parent 의 익명자식객체생성
	
	void method() {
		
		field.parentMethod();
	} // 메소드
	
	
	
}
