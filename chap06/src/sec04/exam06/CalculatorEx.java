package sec04.exam06;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCla = new Calculator();
		
		double box1 = myCla.areaR1(20.3);
		System.out.println("box1 : " + box1);
		
		double box2 = myCla.areaR1(20,20.5);
		System.out.println("box2 : " + box2);
		
		
	}

}
