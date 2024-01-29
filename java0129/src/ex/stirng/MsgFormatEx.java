package ex.stirng;

import java.text.MessageFormat;

public class MsgFormatEx {

	public static void main(String[] args) {
		int num  = 13;
		String param = "사과";
		String msg = MessageFormat.format("나는 {0}를 {1}개 가졌습니다", param,num);
		System.out.println(msg);
	
		String string = String.format("나는 %s를 %d개 가짐", param,num);
		System.out.println(string);
		
		String str1 = String.valueOf(10);
		System.out.println(str1 + 30);
	}

}
