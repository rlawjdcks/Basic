package stream;

public class StreamEx02 {

	public static void main(String[] args) {
		// String에서 숫자만 추출하여 더하기(sum)
		String input = "1Ca2Adf9";
		int sum = input.chars()
				.filter(Character::isDigit)
				.map(a -> Character.digit(a, 10))
				.sum();
		
		System.out.println(sum);
	}

}
