package sec05.exam02;

public class SingEx {

	public static void main(String[] args) {
		
	
		

		//Singleton singleton1 = new Singleton(); 
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		
		if (singleton2 == singleton3) { //객체의 메모리 주소 비교
			System.out.println("싱클턴은 항상 같은객체가 사용");
		}
		if (singleton2.equals(singleton3)) { //객체가 자체가 같은지 (여기서는 무의미)
			System.out.println("싱클턴은 항상 같은객체가 사용");
		}
	}

}
