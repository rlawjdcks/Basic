package sec03.exam02;

public abstract class Animal { //추상클래스 추상클래스는 추상메서드 담을 수 있음
	public String kind;
	
	
	public void breathe() {
		System.out.println("숨쉰다");
	}
	
	public abstract void sound();//추상메소드선언 {}부분이없음
	
}
