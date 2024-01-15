package sec05.exam02;

public class StudentService {
//	private Student[] stuArr = new Student[3];
	Student stuArr = new Student();
	
	private static StudentService st = new StudentService();
	private StudentService() {
		
	}
	public static StudentService getInstance() {
		return st;
	}
	
}
