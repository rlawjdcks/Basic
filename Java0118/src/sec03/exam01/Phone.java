package sec03.exam01;

public abstract class Phone {
	//추상클래스는 부모 클래스의 메소드들을
	//자식 메소드를 사용해 구체적으로 재정의 한다
	//그러면 다형성을 사용하게 된다 
	
	int x;

	public Phone(int x) {
		super();
		this.x = x;
	}
	
	public abstract String ring(int tel);//추상메서드 선언 상속받은 애들은 
								//실체 클래스의 멤버(필드,메소드) 통일하는데 목적이 있다
	
}
