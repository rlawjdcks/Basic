package sec01;

public class CallByValue {
	

	//매개변수 parameter 지역변수
	public static void increase(int n,Myclass mc) {
		n = n+1;
		System.out.println("increase : " + n);
		
		mc.n += 1;
		System.out.println("increase : " + mc.n);
	}
	
	public static void main(String[] args) {
		 
		int n = 100;
		Myclass mc = new Myclass();
		System.out.println("main 첫번째 mc.n의 값 : " + mc.n);
		
		
		
//		increase(n,mc);
		increase(n,new Myclass());
		
		System.out.println(n);
		System.out.println(mc.n);//1
		
	}

}

class Myclass{
	int n;//0
}