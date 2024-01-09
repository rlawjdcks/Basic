package sec04.exam01;

public class Cal {
	static int sx;
	int x;
	
	//클래스랑 이름이 같고 리턴타입이 없는게 생성자 여기서는 클래스이름 : Cal
	//메서드 이름은 : power()이니까 얘네는 생성자가 아닌 메서드
	void power() {
		System.out.println("전원 켜짐");
		System.out.println("sx : " + sx);
	}
	
	void print() {
		System.out.println(x);
	}
	
}
