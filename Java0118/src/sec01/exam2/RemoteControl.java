package sec01.exam2;

public interface RemoteControl {
	//둘이같음 근데 짧게 많이씀
	public static final int MAX_VOLUME = 10; //상수
	int MIN_VOLUME = 0;
	int x = 100;//상수
	
	public abstract void turnOn(); // 추상메소드
	void turnOff();
}
