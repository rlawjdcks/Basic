package sec01.exam223;

import java.util.HashMap;

public class Student2 {
	public static void main(String[] args) {
		HashMap<Student, String> hashMap  = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번학생총점" + score);
		
		
		//answer
		//문항1 답 : 4 0
		//문항2 답 : 5 0
		//문항3 답 : 0 , arr.length X
		//문항4 답 : 1  X 4번
		//문항5 답 : 생성자 X Static
		//문항6 답 : x
		//문항7 답 : new Aaa({ O
		//문항8 답 : 3 o
		//문항9 답 : 4 o
		//문항10 답 : 4 o
		//문항11 답 : int c=  0; c = a; a = b; b= c; o
		//문항12 답 : 2.break o
		//문항 13 답 : int , sc, (double) o
		//문항14 답 : 3 o
	}
}
