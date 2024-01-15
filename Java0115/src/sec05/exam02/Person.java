package sec05.exam02;

public class Person {
	public static final double PI = 3.14;//상수 앞의 public static final 자리배치는 상관없음
	final String name;
	final String name2 = "이름";
	
	public Person(String name) {
		this.name  = name;
	}

	public static void main(String[] args) {
		Person person = new Person("길동");
		//person.name = "sa";
		Person person2 = new Person("");
		System.out.println(person.name);
		System.out.println(person2.name2);
		
		
		final int x;
		x= 300;
		
	}

}
