package page415;

public class Outter {

	public void method2(final int arg) {
		int localVar = 1;
//		final arg = 100;
//		localVar = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVar;
			}
		}
	}
}
