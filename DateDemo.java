package com.psl.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.DATE, 7);
		
		Date cd = cal.getTime();
		
		System.out.println(cd);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		sdf.setLenient(false); //Does Strict Checking of the date passed
		System.out.println(sdf.format(d));
		
		try {
			Date d1 = sdf.parse("16-09-2015");
			System.out.println(d1	);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		java.sql.Date d3 = new java.sql.Date(d.getTime());
		d3.valueOf("2015-16-09");
		System.out.println(d3.valueOf("2015-01-09"));
	}
}
