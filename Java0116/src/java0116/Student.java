package java0116;

public class Student extends People{
	String hankbun;

	public Student(String hankbun) {
		super(""); //부모의 생성자 호출 (여기서는 기본생성자 호출)
		this.hankbun = hankbun;
	}
	
	void method3() {
		
	}
	
	//메소드 재정의하는거
	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1(); //부모의 메소드 실행
	}
	
	
	
	
}
