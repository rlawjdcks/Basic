package anonymous;


class Parent{
	void method() {}
	
}



public class Child extends Parent{

	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}

	public static void main(String[] args) {
		new Child();//익명객체
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Parent parent = new Parent() { //얘가 child 객체 임

			@Override
			void method() {//
				
				super.method();
			} 
			
		};
		
	}

}
