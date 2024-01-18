package sec03.exam01;

public class Ex1 {


	public static void main(String[] args) {
		Phone phone = new SmartPhone2(10 , 20);
//		Phone phone = new Phone(); //추상클래스 객체 안댐 그러나 
//		상속받은 클래스의 자식객체가 생성될때 super()사용해서 가능함
//		Phone phone = new SmartPhone();
		
		System.out.println(phone.x);
		if (phone instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone) phone;
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

	}

}
