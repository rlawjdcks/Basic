package ex.stirng;

public class StringEx {

	public static void main(String[] args) {
		String aaaString  = "aaa";
		String bbbString  = "bbb";
		
		StringBuilder sBuilder = new StringBuilder();//이방법이 제일 성능이 좋음 1번이 3번은 그냥 문자열붙이기
		sBuilder.append(aaaString);
		sBuilder.append(bbbString);
		System.out.println(sBuilder);
		
		String string = aaaString.concat(bbbString);
		System.out.println(string);
		
	}

}
