package Day13_hw;

import java.util.Calendar;
import java.util.Random;
import java.util.StringTokenizer;

public class Ch06_연습문제 {

	public static void main03(String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6", ",");

		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", ",=");
		int sum = 0;

		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			try {
				sum += Integer.parseInt(s);
				System.out.println(s);
			} catch (NumberFormatException e) {
				System.out.println(s);
			}
		}
		System.out.println("합은 " + sum);
	}
	
	public static void main06(String[] args) {
//		﻿String s1 = Integer.toString(20);
		double d = Double.parseDouble("35.9");
		boolean b = Boolean.getBoolean("true");
		String s2 = Integer.toBinaryString(30);
		String c = Character.toString('c');
	}
	
	public static void main07(String[] args) {
		String a = "가나다라";
		System.out.println(a == "가나다라");
		
		String b = new String(a);
		System.out.println(a == b);
	}
	
	public static void main08(String[] args) {
		String a = new String("  	Oh, Happy	");
		String b = a.trim();
		String c = b.concat(" Day. ");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main09(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = "Java";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(f.equals(d));
	}
	
	public static void main11_1(String[] args) {
		for(int i = 0; i < 10; i++) {
			int r = (int)(100 + Math.random() * 156);
			System.out.print(r);
			System.out.print(" ");
		}
	}
	
	public static void main11_2(String[] args) {
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.print(100 + r.nextInt(156));
			System.out.print(" ");
		}
	}

	public static void main12(String[] args) {
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(Calendar.YEAR,2020);
		date.set(Calendar.MONTH, 11);
		date.set(Calendar.DAY_OF_MONTH, 25);
		
		System.out.println("약속 날짜는 " + date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DAY_OF_MONTH) + "일");
	}
	
}

















