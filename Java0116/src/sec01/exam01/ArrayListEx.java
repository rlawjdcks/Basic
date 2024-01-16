package sec01.exam01;

import java.util.ArrayList;
import java.util.List;
class Student{
	String name;
	int kor;
	public Student(String name,	int kor) {
		this.kor = kor;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + "]";
	}
	
	
}

public class ArrayListEx {

	public static void main(String[] args) {
		String[]  strArrStrings =new String[100]; // 고정배열 , 속도 빠름
		List<Student>slist = new ArrayList<>();
		slist.add(new Student("a",90));
		slist.add(new Student("b",90));
		for (Student string : slist) {
			System.out.println(string);
		}
		
		ArrayList<String> alist = new ArrayList<String>();
		//어레이 리스트라고 읽음. 문자열을 가변적인 배열로
		List<String> list= new ArrayList<>();//축약형
		list.add("ad");
		list.add("adv");
		list.add("adc");
		for (String string : list) {
			System.out.println(string);
		}
		list.set(1, "gsd");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
