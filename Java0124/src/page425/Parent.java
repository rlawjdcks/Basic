package page425;

public class Parent {
	void parnetMethod() {};
}

class A{
	void method1(Parent p) {}
	
	
	void method2() {
		method1(new Parent() {

			@Override
			void parnetMethod() {
				super.parnetMethod();
			}
			
		});
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Parent field = new Parent() {// 익명자식객체 A의 필드

		@Override
		void parnetMethod() {
			super.parnetMethod();
		}
		
	};
	void method() {
		Parent var = new Parent() {
			
		};
	}
	
}
