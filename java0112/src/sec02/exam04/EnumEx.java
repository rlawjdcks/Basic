package sec02.exam04;

import java.util.Calendar;

public class EnumEx {

	public static void main(String[] args) {
		Week today = null;
		Week av =Week.FDAY;
		System.out.println(av);
		
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TDAY;
			break;
		case 4:
			today = Week.WDAY;
			break;
		case 5:
			today = Week.THDAY;
			break;
		case 6:
			today = Week.FDAY;
			break;
		case 7:
			today = Week.SAD;
			break;

		}
		
		System.out.println("오늘요일 : " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일 축구");
		} else {
			System.out.println("자바공부해");
		}
	}

}

























