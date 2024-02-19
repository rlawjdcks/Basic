package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import dao.MemberDao;
import dto.Member;

public class HashTableEx2 {

	public static void main(String[] args) {
		
		MemberDao dao = MemberDao.getInstance();
		HashMap<String,Member>map = dao.selectMembers();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("아이디 비번 입력");
			System.out.println("아이디 :");
			String idString = scanner.nextLine();
			System.out.println("이메일 :");
			String email = scanner.nextLine();
			System.out.println();
			
			if (map.containsKey(idString)) {
				if (map.get(idString).getEmail().equals(email) ) {
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
