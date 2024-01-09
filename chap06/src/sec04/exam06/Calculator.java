package sec04.exam06;

public class Calculator {
	//정사각형 넓이
	double areaR1(double width) {
		return width*width;
	}
	
	double areaR1(double width, double height) {
		return width*height;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.areaR1(4000));
	}
}
