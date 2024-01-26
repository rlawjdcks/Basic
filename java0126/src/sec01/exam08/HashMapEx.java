package sec01.exam08;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<>();
		map.put("김이름", 95);
		map.put("김이름", 195);
		map.put("이이름", 90);
		map.put("박이름", 80);
		map.put("하나박이름", 80);
		
		System.out.println(map.get("김이름"));
		System.out.println(map.size());
	}

}
