package a20240708;

import java.util.Calendar;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUSEDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAy; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : "+ today);
		
		
	}

}
