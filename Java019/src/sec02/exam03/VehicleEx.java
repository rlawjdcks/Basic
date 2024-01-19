package sec02.exam03;

import java.util.ArrayList;
import java.util.List;
class Acc{
	
}


public class VehicleEx {

	public static void main(String[] args) {
//		List<String> list = new ArrayList();
//		list.add(123);
//		list.add("문자열");
//		list.add(3.14);
//		list.add(new Acc());
//	
//		for (Object object : list) {
//			String string = (String) object;
//			System.out.println(object);
//		}
		
		  
		
		
//		Bus bus = new Bus(); //?이렇게 그냥 객체만들면 안되나 왜 강제형변환
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		Bus bus = (Bus) vehicle; 
		
		
		bus.run();
		bus.checkFare();
	}

}
