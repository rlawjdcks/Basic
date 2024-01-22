package page409;

public class LocalClass {

	void mehod() {
		class D{ // 중첩클래스는 접근제한자 사용불가
			D() {}
			int field1;
//			static int field2;
			void method1() {}
			
			
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
