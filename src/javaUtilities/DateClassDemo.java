package javaUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date class is used to retrieve the date and time
		
		Date d = new Date();
		System.out.println(d.toString());
		
		//Simple Date Format accepts Date Format as an argument
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdff = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdff.format(d));
	}

}
