package sec02.exam03;

import sec02.exam03.Button.OnClickListener;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//listener 필드 생성
	
	//static interface를 구현
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void onClick() {
			System.out.println("전화걸기");
		}
		
	};
	
	Window(){
		
		//button1 에 대한 void setOnClickListener(OnClickListener listener) {이게 돌아감
		button1.setOnClickListener(listener);
		
		
		button2.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("메세지보내기");

			}
		
		
		});
	}
}
