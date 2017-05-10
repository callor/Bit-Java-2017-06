package com.bit.alg;

import java.util.Calendar;

public class PrimeTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int maxNum = 20001;
		int count = 0;

		int resultPrime = 0;
		System.out.println("##  시작시간 : " + formatTime(startTime));
		for (int i = 2;; i++) {
			int j = 2;
			for (; j < i; j++) {
				if (i % j == 0)
					break;
			}
//			System.out.println(i + "\t" + j);
			if (j >= i) {
				count++;
				if (count == maxNum) {
					resultPrime = i;
					break;
				}
			}
		}
		System.out.println("찾은 최대소수:" + resultPrime);
		// 종료 시간
		long endTime = System.currentTimeMillis();
		// 시간 출력
		System.out.println("##  종료시간 : " + formatTime(endTime));
		System.out.println("##  소요시간(초.0f) : " + (endTime - startTime) / 1000.0f + "초");

	}


	public static String formatTime(long lTime) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lTime);
		return (c.get(Calendar.HOUR_OF_DAY) + "시 " + c.get(Calendar.MINUTE) + "분 " + c.get(Calendar.SECOND) + "."
				+ c.get(Calendar.MILLISECOND) + "초");
	} // end function formatTime()

}
