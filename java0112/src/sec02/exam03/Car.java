package sec02.exam03;


//메소드는 필드값을 다루는일을한다
public class Car {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없어요");
			return false;
		}
		System.out.println("gas있어요");
		return true;
		
	}
	void run() {
		while (true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량 : "+ gas +")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량 : " + gas +")");
				return;
			}
		}
	}
}
