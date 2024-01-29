package ex.stirng;

import java.util.ArrayList;
import java.util.List;

public class StJo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("i");
		list.add("nu");
		list.add("li");
		String mString = String.join("", list);
		System.out.println(mString);

		String mString2 = String.join(".","www","naver","com");
		System.out.println(mString2);
	}

}
