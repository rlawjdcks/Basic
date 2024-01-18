package design.pattern;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
//		CarFactory carFactory = new StateDoorFactory();
		Scanner scanner = new Scanner(System.in);
		CarFactory carFactory =null; 
		System.out.println(" 차량선택해 1국산 2 미국");
		System.out.println("선택 : ");
		String key = scanner.nextLine();
		switch (key) {
		case "1":
			carFactory = new KoreaCarFactory();
			break;
		case "2":
			carFactory = new StateDoorFactory();
			break;
		default:
			System.out.println("다시골라");
			break;
		}
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();
		
		String tire = tireProduct.makeAssemble(); 
		String door = doorProduct.makeAssemble();
		System.out.println(tire);
		System.out.println(door);
		
	}

}
