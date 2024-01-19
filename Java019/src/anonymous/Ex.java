package anonymous;

class AnyClass{
	void mmm() {};
}

public class Ex {

	public static void main(String[] args) {
		AnyClass ac = new AnyClass() {

			@Override
			void mmm() {
				// TODO Auto-generated method stub
				super.mmm();
			} 
			
		};//익명의 자식객체임 익명이라 이름은 없음 호출 안됨
	}

}
