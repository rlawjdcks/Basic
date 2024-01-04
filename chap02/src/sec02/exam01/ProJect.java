package sec02.exam01;

import java.util.Scanner;

class Member {
    private String name;
    private int number1;
    private String number2;
    private String password;

    public Member(String name, int number1, String number2, String password) {
        this.name = name;
        this.number1 = number1;
        this.number2 = number2;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getNumber1() {
        return number1;
    }

    public String getNumber2() {
        return number2;
    }

    public String getPassword() {
        return password;
    }

    // 로그인을 위한 메소드
    public boolean login(String inputName, String inputPassword) {
        return name.equals(inputName) && password.equals(inputPassword);
    }
}

public class ProJect {
    private static Member currentMember = null;

    private static void member(Scanner scanner) {
        System.out.println("이름 입력해>");
        String name = scanner.nextLine();
        System.out.println("주민번호>");
        int number1 = scanner.nextInt();
        scanner.nextLine(); // 개행문자 처리
        System.out.println("전화번호 입력해>");
        String number2 = scanner.nextLine();
        System.out.println("패스워드 입력해>");
        String password = scanner.nextLine();

        Member newMember = new Member(name, number1, number2, password);

        System.out.println("입력한 내용");
        System.out.printf("이름 %s\n주민번호 %d\n전화번호 %s\n패스워드 %s\n", name, number1, number2, password);
        System.out.println("회원가입 완료");

        // 회원가입 후에 다시 메인 메뉴로
        mainMenu(scanner, newMember);
    }

    private static void logout() {
        if (currentMember != null) {
            System.out.println(currentMember.getName() + "님 로그아웃 되었습니다.");
            currentMember = null;
        } else {
            System.out.println("로그인 상태가 아닙니다.");
        }
    }

    private static void login(Scanner scanner, Member member) {
        if (currentMember != null) {
            System.out.println("이미 로그인 상태입니다. 로그아웃 후 다시 시도해주세요.");
            return;
        }

        System.out.println("아이디");
        String nameString = scanner.nextLine();
        System.out.println("패스워드");
        String inputPassword = scanner.nextLine();

        if (member != null && member.login(nameString, inputPassword)) {
            System.out.println("로그인 성공");
            currentMember = member;
        } else {
            System.out.println("로그인 실패");
        }
    }

    public static void money(Scanner scanner) {
        boolean run = true;
        int balance = 0;
        while (run) {
            System.out.println("----------------------------------");
            System.out.println("111.예금 | 222.출금 |333.잔고 |444.상위메뉴로");
            System.out.println("----------------------------------");
            System.out.println("선택");
            int num1 = scanner.nextInt();
            int put = 0;
            int min = 0;

            if (num1 == 111) {
                System.out.println("선택> 111");
                System.out.print("예금액은>");
                put = scanner.nextInt();
                balance = balance + put;
            } else if (num1 == 222) {
                System.out.println("선택>222");
                System.out.print("출금액>");
                min = scanner.nextInt();
                balance = balance - min;

            } else if (num1 == 333) {
                System.out.println("선택>333");
                System.out.println("잔고는>" + balance);
            } else if (num1 == 444) {
                System.out.println("선택>444");
                System.out.println("상위 메뉴로");
                break;
            }
        }

        // num1이 4일 때 상위 메뉴로 이동
        mainMenu(scanner, currentMember);
    }

    private static void mainMenu(Scanner scanner, Member newMember) {
        boolean run = true;
        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.로그아웃 | 5.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int menuNum;
            try {
                menuNum = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }

            switch (menuNum) {
                case 1:
                    login(scanner, newMember);
                    break;
                case 2:
                    member(scanner);
                    break;
                case 3:
                    money(scanner);
                    break;
                case 4:
                    logout();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mainMenu(scanner, null);
    }
}