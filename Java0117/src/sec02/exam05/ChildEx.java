package sec02.exam05;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data";
//		parent.field2 = "data";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent; // 강제 타입 변환 문법상오류없음
		
		child.field2 = "y";
		child.method3();
	}

}
