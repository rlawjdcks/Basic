package page421;

import page421.Car.Engine;

public class NestedClassEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
				
		Car.Engine Engine = new Car.Engine();
	}

}
