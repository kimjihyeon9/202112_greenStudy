package inheritance;

class Shape { // 슈퍼 클래스
	public Shape next;

	public Shape() {
		next = null;
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

public class MathodOverriding {

	static void paint(Shape p) {
		p.draw();
		// p가 가리키는 객체 내에 오버라이딩 된 draw() 호출
		// 동적 바인딩
	}

	public static void paint_text(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

	// Linked List
	public static void main(String[] args) {
		Shape start, last, node;
		start = new Line();
		last = start;
		node = new Rect();
		last.next = node;
		last = node;
		node = new Line();
		last.next = node;
		last = node;
		node = new Circle();
		last.next = node;
		last = node;
		Shape cur = start;
		
		while (cur != null) {
			cur.draw();
			cur = cur.next;
		}

	}

}
