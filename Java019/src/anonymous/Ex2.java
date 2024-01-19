package anonymous;

interface Inter{//interface는 구현객체 필요
	void disp();
}

public class Ex2 {

	public static void main(String[] args) {
		Inter inter = new Inter() {//interface는 구현객체 필요한데 얘가 구현객체임
			int y = 100;
			public void disp2() {
				System.out.println("disp2"); //얘는 안나옴
			}
			
			@Override
			public void disp() {
				System.out.println(y); //얘는 나옴
//				disp2(); 이렇게 재정의 한 곳에서 나옴
			}
		};
		inter.disp();
		
	}

}
