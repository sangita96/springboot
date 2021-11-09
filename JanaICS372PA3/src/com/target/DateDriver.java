package com.target;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.adapter.DateImpl;

public class DateDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateImpl obj = new DateImpl();
		
		obj.setYear(2021);
		System.out.println("getYear() " + obj.getYear());
		
		obj.setMonth(2);
		System.out.println("getMonth() " + obj.getMonth());
		
		obj.setDayOfMonth(32);
		System.out.println("getDayOfMonth() " + obj.getDayOfMonth());
		System.out.println("month" + obj.getMonth());
		
		obj.setHours(20);
		System.out.println("getHours() " + obj.getHours());
		
		obj.setMinutes(20);
		System.out.println("getMinutes() " + obj.getMinutes());
		
		obj.setSeconds(20);
		System.out.println("getSeconds() " + obj.getSeconds());
		
		
		Date d=new Date();
//		d.setYear(2010);
//		System.out.println(d.getYear());
//		d.setMonth(15);
//		System.out.println(d.getMonth());
//		d.setDate(32);
//		System.out.println(d.getDate());
//		d.setDayOfMonth(15);
//		System.out.println(d.getDayOfMonth(15)());
		
		/*GregorianCalendar gcal = new GregorianCalendar();
		gcal.set(Calendar.DAY_OF_MONTH, 34);
		System.out.println("GregorianDayOfMonth() " + gcal.get(Calendar.DAY_OF_MONTH));*/
	}

}

