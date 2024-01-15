package sec05.exam02;

public class StuEx {

	public static void main(String[] args) {
		StudentService ss = StudentService.getInstance();
		ss.stuArr.name = "길";
		ss.stuArr.hak = "2020";
		ss.stuArr.kor = 84;
		ss.stuArr.math = 31;
		ss.stuArr.eng = 24;
		
		
		StudentService ss1 = StudentService.getInstance();
		System.out.println(ss.stuArr.name);
		System.out.println(ss1.stuArr.name);
		
		
		
		if (ss.stuArr.equals(ss1.stuArr)) {
			System.out.println("same");
		}
		
		if (ss.stuArr==ss1.stuArr) {
			System.out.println("same");
		}
	}

}
