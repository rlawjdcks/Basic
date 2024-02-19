package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12456");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("아이디 비번 입력");
			System.out.println("아이디 :");
			String idString = scanner.nextLine();
			System.out.println("비번 :");
			String pw = scanner.nextLine();
			System.out.println();
			
			if (map.containsKey(idString)) {
				if (map.get(idString).equals(pw)) {
					System.out.println("로그인됨");
					break;
				} else {
					System.out.println("비번오류");
				}
			} else {
				System.out.println("아이디 존재 안함");

			}
			
		}
	}

}
