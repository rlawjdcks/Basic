package sec02.exam02;

public class CarEx {

	public static void main(String[] args) {
		
		
		//객체는 heap영역에 있어서 변수로 호출할 수 밖에 없다 그래서 보이지는 않는다고 봐야함
		
		Car car2 = new Car();
		System.out.println(car2);
		
		Car car3 = new Car("현대자동차");
		System.out.println(car3);
		
		Car car4 = new Car("현대", "코나", "ver.1",150);
		System.out.println(car4);
		
		Car car5 = new Car("도요타", 150);
		System.out.println(car5);
		
		Car car = new Car();
		car.company = "KIA";
		car.color = "red";
		car.model = "K7";
		car.maxSpeed = 200;
		System.out.println(car);
	}

}
