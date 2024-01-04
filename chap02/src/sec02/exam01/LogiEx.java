package sec02.exam01;

public class LogiEx {

	public static void main(String[] args) {

		int charCode = 'A';
		
		if ((charCode>=65 & (charCode<=90))) {// 앞뒤 둘다 계산
			System.out.println("대문자");
		} 	
		if ((charCode>=97 && (charCode<=122))) { // 앞만 틀려도 뒤는 계산X 따라서 &&가 효율적 ||도 마찬가지
			System.out.println("소문자");
		} 	
		if ((charCode<48 && (charCode>57))) {
			System.out.println("0~9");
		} 	
		
		
		int value = 6;
		
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2또는 3의배수");
		} 	
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의배수");
		} 	
		
	}

}
