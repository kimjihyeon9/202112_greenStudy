package Day13_hw;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

//////////////////////////////////////////1번
class MyPoint {
	int a, b;

	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		String s = "Point(" + a +  "," + b + ")";
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint)obj;
		if(a == p.a && b == p.b) {
			return true;
		} else {
			return false;
		}
	}
}

//////////////////////////////////////////2번
class Circle {
	int x, y, z;

	public Circle(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString() {
		String s = "Circle(" + x + "," + y + ")반지름" + z;
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		Circle a = (Circle)obj;
		if(x == a.x && y == a.y) {
			return true;
		} else {
			return false;
		}
	}
}

//////////////////////////////////////////3번
// package etc;

class Calc{
	private int x, y;

	public Calc(int i, int j) {
		this.x = x;
		this.y = y;
	}

	public int sum() {
		return x + y;
	}
}

//////////////////////////////////////////4번
// package base;
class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

// package derived;
// import base.Shape;
class Circle_ extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

//////////////////////////////////////////6번
class Player {
	Calendar nowT = Calendar.getInstance();
	Scanner scan = new Scanner(System.in);
	String n;
	int s1, s2;
	
	public Player(String n) {
		this.n = n;
	}
	
	public int run() {
		System.out.print(n + " 시작 <Enter>키>> ");
		s1 = enter();
		System.out.print("10초 예상 후 <Enter>키>> ");
		s2 = enter();
		
		if(s1 < s2) {
			return s2 - s1;
		} else {
			return 60 - s1 + s2;
		}
	}
	
	public int enter() {
		String e = scan.nextLine();
		nowT = Calendar.getInstance();
		System.out.println("현재 초 시간 = " + nowT.get(Calendar.SECOND));
		return nowT.get(Calendar.SECOND);
	}
}

//////////////////////////////////////////7번

public class Ch06_실습문제 {

	public static void main01(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		
		if(p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른 점");
		}
	}
	
	public static void main02(String[] args) {
		Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인원
		Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		} else {
			System.out.println("서로 다른 원");
		}
	}
	
//	package main;
//	import etc.Calc;
	public static void main03(String[] args) {
		Calc c = new Calc(10, 20);
		System.out.println(c.sum());
	}
	
//	package app;
//	import base.Shape;
//	import derived.Circle;
	public static void main04(String[] args) {
		Shape shape = new Circle_();
		shape.draw();
	}
	
	public static void main05(String[] args) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int ampm = now.get(Calendar.AM_PM);
		
		System.out.println("현재 시간은 " + hour+ "시 " + minute + "분입니다.");
		
		if(hour > 4 && hour < 12)
			System.out.println("Good Moring");
		else if(hour >= 12 && hour < 18)
			System.out.println("Good Afternoon");
		else if(hour >= 18 && hour < 22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}
	
	public static void main(String[] args) {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		Player player1 = new Player("황기태");
		Player player2 = new Player("이재문");
		
		int a = player1.run();
		int b = player2.run();
		
		if(Math.abs(a - 10) < Math.abs(b - 10)) {
			System.out.printf("황기태의 결과 %d, 이재문의 결과 %d, 승자는 황기태", a, b);
		} else {
			System.out.printf("황기태의 결과 %d, 이재문의 결과 %d, 승자는 이재문", a, b);
		}
	}
	
	public static void main07_1(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scan.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("어절 개수는 " + st.countTokens());
		}
		scan.close();
	}
	
	public static void main07_2(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String a = scan.nextLine();
			if(a.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			String s[] = a.split(" ");
			System.out.println("어절 개수는 " + s.length);
		}
	}
	
	public static void main08(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		for(int i = 1; i <= s.length(); i++) {
			System.out.print(s.substring(i));
			System.out.println(s.substring(0, i));
		}
		
//		int i = 1;
//		while(i <= s.length()) {
//			System.out.print(s.substring(i));
//			System.out.println(s.substring(0, i));
//			i++;
//		}
		scan.close();
	}
	
	public static void main09(String[] args) {
		
	}

}













