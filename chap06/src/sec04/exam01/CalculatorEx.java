package sec04.exam01;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		int num1 = calculator.plus(20,30);
		System.out.println("num1 :"+num1);
		double num2 = calculator.plus(200.0,30.3);
		System.out.println("num2 :"+num2);
	}

}
