package sec01.exam01;

public class MemberEx {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());		
		
		//애초에 객체 비교는 == , equals를 쓰던 힙 영역이라 false가 나와야 함
		//String은 이미 api로 equals로 같으면 true가 되게 설정해놓은거임 
		//hashcode값도 같고 동등객체일때는 동등하다 할 수 있음
		if (obj1.equals(obj2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");

		}
		
		if (obj1.equals(obj3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
			
		}
	}
	

}
