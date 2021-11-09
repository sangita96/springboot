package com.adapter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import com.target.DateInterface;

public class DateImpl implements DateInterface {

	GregorianCalendar gcal = new GregorianCalendar();
	
	/*public DateImpl(GregorianCalendar gcal) {
		super();
		this.gcal = gcal;
	}*/

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return gcal.get(Calendar.YEAR);
	}

	@Override
	public boolean setYear(int year) {
		// TODO Auto-generated method stub
		gcal.set(Calendar.YEAR, year);
		return true;
	}
	
	@Override
	public int getMonth() {
		// TODO Auto-generated method stub
		return gcal.get(Calendar.MONTH);
	}

	@Override
	public boolean setMonth(int month) {
		// TODO Auto-generated method stub
		if (month >= 0 && month <= 11) {
				gcal.set(Calendar.MONTH, month);
			return true;
		}
		return false;
	}
	
	@Override
	public int getDayOfMonth() {
		// TODO Auto-generated method stub
		return gcal.get(Calendar.DAY_OF_MONTH);
	}

	@Override
	public boolean setDayOfMonth(int date) {
		// TODO Auto-generated method stub
		int month=getMonth();
		int flag=0;
		if(month==1)
		{
			if(isLeapYear())
			{
				if(date>=1 && date<30)
				{
				gcal.set(Calendar.DAY_OF_MONTH, date);
				flag=1;
				}
				else if(date>29)
				{
					gcal.set(Calendar.DAY_OF_MONTH, 1);
					gcal.set(Calendar.MONTH,2);
				}
			}
		}
		else if(month==0||month==2||month==4||month==6||month==7||month==9||month==11)
		{
			if(date>=1 && date<32)
			{
			gcal.set(Calendar.DAY_OF_MONTH, date);
			flag=1;
			}
			else if(date>31)
			{
				gcal.set(Calendar.DAY_OF_MONTH, 1);
				gcal.set(Calendar.MONTH,month+1);
			}
		}
		else
		{
			if(date>=1 && date<31)
			{
			gcal.set(Calendar.DAY_OF_MONTH, date);
			flag=1;
			}
			else if(date>30)
			{
				gcal.set(Calendar.DAY_OF_MONTH, 1);
				gcal.set(Calendar.MONTH,month+1);
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}

	@Override
	public int getHours() {
		// TODO Auto-generated method stub
		return gcal.get(Calendar.HOUR_OF_DAY);
	}

	@Override
	public boolean setHours(int hours) {
		// TODO Auto-generated method stub
		if (hours >= 0 && hours <=23) {
			gcal.set(Calendar.HOUR_OF_DAY, hours);
			return true;
		}
		return false;
	}

	@Override
	public int getMinutes() {
		// TODO Auto-generated method stub
		return gcal.get(Calendar.MINUTE);
	}

	@Override
	public boolean setMinutes(int minutes) {
		// TODO Auto-generated method stub
		if (minutes >= 0 && minutes <=59) {
			gcal.set(Calendar.MINUTE, minutes);
			return true;
		}
		return false;
	}

	@Override
	public int getSeconds() {
		// TODO Auto-generated method stub
		return gcal.get(Calendar.SECOND);
	}

	@Override
	public boolean setSeconds(int seconds) {
		// TODO Auto-generated method stub
		if (seconds >= 0 && seconds <=59) {
			gcal.set(Calendar.SECOND, seconds);
			return true;
		}
		return false;
	}

	@Override
	public boolean isLeapYear() {
		// TODO Auto-generated method stub
		int year = getYear();
		
		if((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
			return true;
		}
		
		return false;
	}




	
//	
//	public boolean setYear(int year) {
//		gcal.set(Calendar.YEAR, year);
//		return true;
//	}
	
//	 public int getMonth()
//	 {
//		 int m;
//			m=gcal.get(Calendar.YEAR);
//			return m;
//	 }
	/* public boolean setMonth(int month)
	 {
		 
	 }
	 public int getDayOfMonth()
	 {
		 
	 }
	 public boolean setDayOfMonth(int date)
	 {
		 
	 }
	 public int getHours()
	 {
		 
	 }
	 public boolean setHours(int hours) {
		 
	 }
	 public int getMinutes(){
		 {
			 
		 }
	 }
	 public boolean setMinutes(int minutes)
	 {
		 
	 }
	 public int getSeconds()
	 {
		 
	 }
	 public boolean setSeconds(int seconds)
	 {
		 
	 }*/
//	 public boolean isLeapYear()
//	 {
//		int y=getYear(); 
//		 if((y % 400 == 0) ||
//			       (y % 100 != 0) &&
//			       (y % 4 == 0))
//			    {
//			      return true;
//			    }
//			    else
//			    {
//			      return false;
//			    }
//	 }
}