package ramda;

public class MyFuncEx {

	public static void main(String[] args) {
		//ramda식은 재정의할 메서드 개수가 1개여야함
		MyFunc myFunc,myFunc2,myFunc3;
		
		myFunc3 =  (a) -> {
			System.out.println(a);
		};

		myFunc3.method(5);
		
		myFunc = new MyFunc() {
			@Override
			public void method(int x) {
				System.out.println(x);
			}
		};
		myFunc.method(10);
		
	}

}
