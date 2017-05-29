package com.bit.maven.Mavem01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date getDate = new Date();// 현재시각을 추출
		System.out.println(getDate.toString());

		// 날짜 포멧
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String todayDate = dateFormat.format(getDate);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		String curTime = timeFormat.format(getDate);
		
		SimpleDateFormat dateTime = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss");
		String dt = dateTime.format(getDate);

		System.out.println(todayDate);
		System.out.println(curTime);
		System.out.println(dt);
		
		System.out.println(getDate.getTime());
		
		Calendar cal = Calendar.getInstance();
		todayDate = dateFormat.format(cal.getTime());
		curTime = timeFormat.format(cal.getTime());
		dt = dateTime.format(cal.getTime());
		
		System.out.println(todayDate);
		System.out.println(curTime);
		System.out.println(dt);
		
		
		
	}

}
