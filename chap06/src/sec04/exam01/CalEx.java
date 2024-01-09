package sec04.exam01;

public class CalEx {

	public static void main(String[] args) {
		
		//클래스랑 이름이 같고 리턴타입이 없는게 생성자 아니면 메서드
		Cal.sx = 500;
		Cal cal = new Cal();
		cal.power();
		cal.x = 100;
		cal.print();
		
		Cal cal2 = new Cal();
		System.out.println(cal2.x);
		cal2.power();
		
	}

}
