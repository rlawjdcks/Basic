package ramda;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface f1;

		f1 = (x,y) ->x + y;
		int z =  f1.method(20, 10);
		System.out.println(z);
	}
	public static int sum(int x , int y) {
		return x+y;
	}
	
	
}
