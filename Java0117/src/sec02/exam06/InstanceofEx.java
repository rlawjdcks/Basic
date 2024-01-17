package sec02.exam06;

public class InstanceofEx {

	public static void main(String[] args) {
		Parent parentA = new Child(); //자동형변환
		method2(parentA);
		
		Parent parentB = new Parent();
//		Parent parentB = new Child();
		if (parentB instanceof Child) { //객체먼저넣고 타입 넣기 강제형변환이 되냐 물어보는거임
			method2(parentB);
		} else {
			System.out.println("변환불가");
		}
		
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent; //강제형변환
		System.out.println("변환가능");
	}

}
