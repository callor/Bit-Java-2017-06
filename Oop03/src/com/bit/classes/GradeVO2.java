package com.bit.classes;

public class GradeVO2 extends GradeVO {

	public void total() {

		// int t = getIntKor();
		// t += getIntEng();
		// t += getIntMath();
		// setIntTotal(t);

		intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;

	}

	public void gradeList() {
		System.out.print(getIntNum());
		System.out.print("\t");

		System.out.print(getIntKor());
		System.out.print("\t");

		System.out.print(getIntEng());
		System.out.print("\t");

		System.out.print(getIntMath());
		System.out.println();
	}
}
