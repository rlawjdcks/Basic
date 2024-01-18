package sec01.exam2;

public class MyClass implements InterTest {



	@Override
	public void test1() {
		System.out.println("재정의");
	}

	@Override
	public void test() {
	
		
	}
	
	public static void main(String[] args) {
		InterTest.test5();
		InterTest it = new MyClass();
		it.test1();
		
	}

}
