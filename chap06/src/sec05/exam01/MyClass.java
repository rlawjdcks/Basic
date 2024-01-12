package sec05.exam01;

public class MyClass {

	int x;
	int y;
	int z;
	
	public MyClass(int x) {
//		this.x = x;
		this(x, 0, 0);
		System.out.println("1번째 생성자");
	}

	public MyClass(int x, int y) {
//		this.x = x;
//		this.y = y;
		this(x, y, 0);
		System.out.println("2번째 생성자");
	}

	@Override
	public String toString() {
		return "MyClass [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public MyClass(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("명령");
		System.out.println("3번째 생성자");
	}

	public static void main(String[] args) {
		MyClass class1 = new MyClass(200);
		System.out.println(class1);
		MyClass class2 = new MyClass(200,5);
		System.out.println(class2);
		
		
	}

}