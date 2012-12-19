package com.revcal.test.client;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EventAdapter {
	
	public EventAdapter(Event event) {
		
		Calendar startTimeCal = new GregorianCalendar(); 
		Calendar endTimeCal = new GregorianCalendar();
		startTimeCal.setTime(event.starttime);
		endTimeCal.setTime(event.endtime);
		int startTimeHours = startTimeCal.get(Calendar.HOUR_OF_DAY);
		int startTimeMinutes = startTimeCal.get(Calendar.MINUTE);
		int endTimeHours = endTimeCal.get(Calendar.HOUR_OF_DAY);
		int endTimeMinutes = endTimeCal.get(Calendar.MINUTE);
		
	}

}
