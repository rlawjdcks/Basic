package sec02.exam02;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		
		//  자동 형변환 (아래와 비슷한느낌)
		//int x = 100;
		//double y = x ;
//		Parent parent = new Child();
		Parent parent = child; //바로 위랑 같은 말임 형태만다른거
		
		parent.method1();
		parent.method2();
		child.method3();
//		parent.method3();
	}

}
