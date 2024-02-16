package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx01 {

	public static void main(String[] args) {
		List<Integer> list  
//				= new ArrayList<Integer>();
//				list.add(1);
//				list.add(2);
//				list.add(3);
//				list.add(4);
				 = Arrays.asList(1,2,3,4,5); //위에 쓰는거랑 똑같은거임
		
//		for (Integer integer : list) {
//			if ( integer %2 == 0) {
//				System.out.println(integer);
//			}
//		}
		int x = (int) list.stream().count();
		System.out.println(x);
		
		list.stream()
//		.filter(i->i%2 == 0)
		.map(i->i*2)
		.limit(3)
		.forEach(i->System.out.println(i)); //stream식 사용법
//		.forEach(System.out::println);
	}

}
