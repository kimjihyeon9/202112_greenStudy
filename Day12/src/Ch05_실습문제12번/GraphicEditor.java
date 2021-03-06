package Ch05_실습문제12번;

import java.util.Scanner;

// 실습문제 12번

public class GraphicEditor{
	abstract class Shape { // 슈퍼 클래스
		private Shape next;
		
		public Shape() {
			next = null;
		}
		
		public void setNext(Shape obj) { // 링크드 연결
			next = obj;
		}
		
		public Shape getNext() {
			return next;
		}
		
		public abstract void draw(); // 추상메소드
		
	}
	
	class Line extends Shape {
		public void draw() { // 메소드 오버라이딩
			System.out.println("Line");
		}
	}
	
	class Rect extends Shape {
		public void draw() { // 메소드 오버라이딩
			System.out.println("Rect");
		}
	}
	
	class Circle extends Shape {
		public void draw() { // 메소드 오버라이딩
			System.out.println("Circle");
		}
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			int i = scan.nextInt();
			
		}
	}
}
