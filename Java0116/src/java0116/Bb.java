package java0116;

class Aa {
	private int y;
	final int x;
	Aa() {
		this.x = 0;
	}
	Aa(int x ) {
		this.x = x;
	}
	Aa(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

public class Bb extends Aa {
	void method() {
//		System.out.println(x);
	}
}
