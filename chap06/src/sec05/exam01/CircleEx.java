package sec05.exam01;

public class CircleEx {

	public static void main(String[] args) {

		//참조 = 메모리 주소값, 주소를 담을 방을 만듦
		Circle[] c;
		c = new Circle[5];
		
		
		for (int i = 0; i < c.length; i++) {
			
			c[i] = new Circle(i);
			
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getArea());
		}
		
	}

}
