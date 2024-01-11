package sec01;

public class MainEx {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("값의 수 부족");
			System.exit(0); // 0: 정상종료
		}
		String str = args[0];
		System.out.println(args[0]);
		
	}

}
