package sec02.exam02;

public class AnoEx {

	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.turnOn();
		anonymous.field.turnOff();
		anonymous.method1();
		anonymous.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트 켜다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트 끄다");
				
			}
		});
	}

}
