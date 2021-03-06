package Ch05_실습문제풀이_6;

import java.util.Scanner;

// 실습문제 12번

abstract class Shape { // 슈퍼 클래스
	public Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) { // 링크드 연결
		next = obj;
	}

	public void draw() {
		System.out.println("Shape");
	}

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

class ShapeLinkedList {
	private Shape start, last, node, cur;
	private int size = 0;

	public void append(Shape shape) {
		size++;
		if (start == null) {
			start = shape;
			last = start;
			return;
		}
		node = shape;
		last.next = node;
		last = node;
	}

	public void showAll() {
		cur = start;
		while (cur != null) {
			cur.draw();
			cur = cur.next;
		}
	}

	public void remove(int i) {
		if(i > size) {
			System.out.println("삭제할 수 없습니다.");
		} else {
			
//			size--;
		}
	}

	public int size() {
		return size;
	}
}

public class ShapeEx {
	public static void main(String[] args) {
		ShapeLinkedList linkedList = new ShapeLinkedList();
//		linkedList.append(new Circle());
//		linkedList.append(new Rect());
//		linkedList.append(new Line());
//		linkedList.append(new Circle());
//
		linkedList.showAll();
//
//		linkedList.remove(3);
//		System.out.println(linkedList.size());
//		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty을 실행합니다.");

		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			int i = scan.nextInt();

			switch (i) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				int j = scan.nextInt();
				
				switch (j) {
				case 1:
					linkedList.append(new Line());
					break;
				case 2:
					linkedList.append(new Rect());
					break;
				case 3:
					linkedList.append(new Circle());
					break;
				default:
					System.out.println("입력하신 숫자는 없습니다");
					break;
				}
				break;
			case 2:
				System.out.print("삭제할 도형의 위치>> ");
				int k = scan.nextInt();
				linkedList.remove(k);
				break;
			case 3:
				linkedList.showAll();
				break;
			case 4:
				System.out.println("beauty을 종료합니다");
				System.exit(0);
				break;
			default:
				System.out.println("입력하신 숫자는 없습니다.");
				break;
			}
		}

	}
}
