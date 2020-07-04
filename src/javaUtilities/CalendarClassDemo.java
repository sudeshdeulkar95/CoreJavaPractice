package javaUtilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar class is another class to handle date and time
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.ERA));

	}

}
