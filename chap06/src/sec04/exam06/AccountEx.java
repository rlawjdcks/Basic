package sec04.exam06;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		account.name = "ad";
		account.ssn = "9999";
		account.tel = "21543215";
		System.out.println(account);
		
		Account acc1 = new Account("가나","901111","01011111111",26);
		System.out.println(acc1);
		
	}

}
 