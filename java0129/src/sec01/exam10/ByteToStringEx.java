package sec01.exam10;

public class ByteToStringEx {

	public static void main(String[] args) {
		byte[] bytes = {72,103,108,108,111};
		String str = new String(bytes);
		System.out.println(str);
		
//		String str1 = new String();
		char[] ch = {'H','e'};
		System.out.println(ch);
	}

}
