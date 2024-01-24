package sec02.exam02;

public class Anonymous {
	RemoteControl field  =new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("tv켜다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv끄다");
		}
	};
		
		void method1() {
			//필드는 초기화 안해도 되는데 지역변수는 초기화 해야함
			RemoteControl localVar = new RemoteControl() {
				
				@Override
				public void turnOn() {
					System.out.println("Audio켜다");
				}
				
				@Override
				public void turnOff() {
					System.out.println("Audio끄다");

				}
			};
			localVar.turnOn();
		}
	
		void method2(RemoteControl rc) {
			rc.turnOn();
		}

}