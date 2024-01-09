package sec04.exam06;

public class Account {
	
	//overloading 메소드 이름이 똑같은데 여러개 사용 가능
	String name; //이름 필드(아이디)
	String nation; //이름 필드(아이디)
	String ssn;  // 생년월일(패스워드)
	String tel;
	int age;
	
	public Account() {
		System.out.println("내가만든 Account()");
	}
	
	public Account(String name) {
		this.name = name;
	}
	
	public Account(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public Account(String name, String ssn, String tel) {
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
	}

	public Account(String name, String ssn, String tel, int age) {
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", age=" + age + "]";
	}
}
