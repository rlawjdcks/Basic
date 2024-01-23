package page416;

public class Outter {
	String fieldString = "outter -field";
	void method() {
		System.out.println("Outter-method");
	}
	class Nested {
		String fiString = "Nested - field";
		void method() {
			System.out.println("Nest- method");
			
		}
		void print() {
			System.out.println(this.fiString);
			System.out.println(Outter.this.fieldString);
			
			this.method();
			Outter.this.method();
		}
	}
}
