package sec05.exam01;

public class Circle2 {
	
	int radius;
	
	public Circle2(int radius) {
		this.radius = radius;
	
	}
	
	public void set(int radius) {
		this.radius = radius;
	}
	
	
	

	public static void main(String[] args) {
		Circle2 cirl = new Circle2(3  );
		Circle2 cir2 = cirl;
		cirl.set(4);
		cirl.set(5);
		cirl.set(6);

		
	}

}
