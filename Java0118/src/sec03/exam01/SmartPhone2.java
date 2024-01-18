package sec03.exam01;
public class SmartPhone2 extends Phone{
	int y;
	
public SmartPhone2(int x, int y) {
		super(x); // 부모의 생성자 호출
		this.y = y;
	}

//System.out.println(); 필드,생성자,메소드만 가능해서 얘는 안되는거임	클래스는 설계도
	public void printX() {
		System.out.println(x);
	}

	@Override
	public String ring(int tel) {
		// TODO Auto-generated method stub
		return null;
	}

}
