package sec05.exam01;

public class Circle {
	int raidus;
	String name;
	
	public double getArea() {
		return 3.14*raidus*raidus;
	}
	
	public Circle(int radius) {
		this(radius, "원");
	}
	
	public Circle(int raidus, String name) {
		this.raidus = raidus;
		this.name = name;
	}


	public static void main(String[] args) {
		Circle pizza;
		
		
		pizza = new Circle(30 , "as");
		pizza.raidus = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle donut= new Circle(2);
		donut.raidus = 2;
		donut.name = "자바도낫";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은" + area);
		
	}
}
