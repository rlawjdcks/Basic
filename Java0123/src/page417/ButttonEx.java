package page417;

import java.util.Scanner;

public class ButttonEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Button btn = new Button();
		
		Button.OnClickListener listener = null;
		System.out.println("선택 1전화2메시지");
		String string = scanner.nextLine();
		switch (string) {
		case "1":
			listener = new CallListener();
			break;
		case "2":
			listener = new MessageListener();
			break;

		default:
			break;
		}
		btn.setOnClickListener(listener);
		btn.touch();
	}

}
