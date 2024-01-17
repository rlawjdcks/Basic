package sec02.exam04;

import java.util.Scanner;

public class DriverEx {

	public static void main(String[] args) {

		Driver driver = new Driver();
//		driver.driver(new Bus());
//		driver.driver(new Taxi());
		Scanner scanner = new Scanner(System.in);
		System.out.println("이동 차량 선택해 1버스2택시");
		System.out.println("번호 : ");
		int num = Integer.parseInt(scanner.nextLine());
		Vehicle vehicle = null;
		switch (num) {
		case 1:
			vehicle = new Bus();
			break;
		case 2:
			vehicle = new Taxi();
			break;

		default:
			break;
		}
		driver.driver(vehicle);
	}

}
