package sec02.exam01;

public class TypeEx {

	public static void main(String[] args) {
		String str3 = "3.14";
		double value = Double.parseDouble(str3);
		
		
		String str2= "" + 10 + 2;
		System.out.println(str2);
		int num1 = Integer.parseInt(str2);
		
		
		String str= 10 + 2 + "";
		System.out.println(str);
		
		String str1 = String.valueOf(10 + 2);
		
		int x = 1;
		int y = 2;
		double result2 = x / (double) y;
		System.out.println(result2);

		int value1 = 10;
		int value2 = 100;
		int sum = value1 + value2;

		int intValue = 10;
		double doubleValue = 5.5;
		int result = (int) (intValue + doubleValue);
		System.out.println(result);

		byte var1 = 100;
		int var2 = var1;
		long var3 = 10000000l;
		float var4 = var3;
		System.out.println(var4);

		var1 = (byte) var2;
		System.out.println(var1);
		
		long ar = 2L;
		float ar2 = 1.8f;
		double ar3 = 2.5;
		String ar4 = "3.9";
		int result231 = (int)(ar + ar2 + ar3) + (int)Double.parseDouble(ar4);
		System.out.println(result231);
		
	}

}
