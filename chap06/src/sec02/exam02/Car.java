package sec02.exam02;

public class Car {
	
	String company; //객체의 성격
	String model;
	String color;
	int maxSpeed;
	
	//클래스랑 이름이 같고 리턴타입이 없는게 생성자 아니면 메소드
	public Car() {
		System.out.println("Car()");
	}
	
	public Car(String str) {
		company = str;
	}
	public Car(String str, String str1) {
		company = str;
		model = str1;
	}
	
	
	public Car(String company, int maxSpeed) {
		this.company = company;
		this.maxSpeed = maxSpeed;
	}

	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
}
