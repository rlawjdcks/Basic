package sec01.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		List<MenuMemberAccount> list= new ArrayList<>();
		MenuMemberAccount account = new MenuMemberAccount(null, null, null, null, null);
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("번호입력해");
			System.out.println("1.회원출력 2.회원등록 3.파일저장 4.파일읽기 5.종료");
			int insert = Integer.parseInt(scanner.nextLine());
			switch (insert) {
			case 1:
				
				System.out.println("1.회원출력");
				for (MenuMemberAccount string : list) {
					System.out.println(string);
				}
				break;
			case 2:
				System.out.println("2.회원등록");
				System.out.print("이름: ");
				String name = scanner.nextLine();
				System.out.print("아이디: ");
				String id = scanner.nextLine();
				System.out.print("패스워드: ");
				String pass = scanner.nextLine();
				System.out.print("전화번호: ");
				String num =  scanner.nextLine();
				System.out.print("생년월일: ");
				String birth =  scanner.nextLine();
				list.add(new MenuMemberAccount(name, id, pass, num, birth));
//				list.add(name, id, pass, num, birth);
				break;
			case 3:
				System.out.println("3.파일저장");
				break;
			case 4:
				System.out.println("4.파일읽기");
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("5번 종료 할게");
		
	}

}
