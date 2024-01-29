package sec01.exam02;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {//매개변수 다형성 object로 상속
		if (obj instanceof Key) {//key클래스 객체인가?
			Key compareKey = (Key) obj;//key클래스 변수에 대입
			if (this.number == compareKey.number) {//number로 비교하려고
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
	
}
