package ramda;

public class MyFuncEx {

	public static void main(String[] args) {
		
		MyFunc myFunc = () -> {System.out.println("ramda");
		
		};
		myFunc.aaa();
		
		MyFunc myFunc2 = new MyFunc() {
			
			@Override
			public void aaa() {
				System.out.println("randa");
			}
		};
		myFunc2.aaa();
	}

}
