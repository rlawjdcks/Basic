package sec02.exam03;

public class CarEx {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.setGas(52);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발해요");
			
			
			myCar.run();
		}
		
		if (myCar.isLeftGas(  )) {
			System.out.println("가스 주입할 필요없어요");
		} else {
			System.out.println("가스넣으세여");
		}
	}

}
