package sec01.exam223;

import java.util.HashMap;

public class Student2 {
	public static void main(String[] args) {
		HashMap<Student, String> hashMap  = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번학생총점" + score);
		
		
		//answer
		//문항1 답 : 4 
		//문항2 답 : 5
		//문항3 답 : 
		//문항4 답 : 1
		//문항5 답 : 생성자
		//문항6 답 : 
		//문항7 답 : new Aaa({
		//문항8 답 : 3 
		//문항9 답 : 4 
		//문항10 답 : 4 
		//문항11 답 : int c=  0; c = a; a = b; b= c; 
		//문항12 답 : 2.break 
		//문항 13 답 : int , sc, (double) 
		//문항14 답 : 3
	}
}
