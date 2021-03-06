package Ch05_실습문제13번14번;

interface Shape{
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상메소드
	
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape{
	private int r;

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.printf("반지름이 %d인 원입니다.\n", r);
	}

	@Override
	public double getArea() {
		return r * r * PI;
	}
	
}

class Oval implements Shape{
	private int a, b;
	
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void draw() {
		System.out.printf("%dx%d에 내접하는 타원입니다.\n", a, b);
	}
	
	@Override
	public double getArea() {
		return a * b * PI;
	}
	
}

class Rect implements Shape{
	private int c, d;
	
	public Rect(int c, int d) {
		this.c = c;
		this.d = d;
	}
	
	@Override
	public void draw() {
		System.out.printf("%dx%d크기의 사각형 입니다.\n", c, d);
	}
	
	@Override
	public double getArea() {
		return c * d;
	}
	
}

public class Ch05_13_14 {

	public static void main(String[] args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
	
	public static void main14(String[] args) {
		Shape [] list = new Shape[3]; // Shape 을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		
		for(int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		for(int i = 0; i < list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}
	}

}
