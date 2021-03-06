package Day12;

/*////////////////////////////////////////// 3번
class SharpPencil {
	private int width; // 펜의 굵기
	private int amount; // 남은 량

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}

class BallPen extends SharpPencil {
	private String color; // 볼펜의 색

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class FountainPen extends BallPen {
	public void refill(int n) { // 남은량 보충
		setAmount(n);
	}
}

//////////////////////////////////////////6번

class TV {
	private int size;

	public TV(int n) {
		size = n;
	}
}

class ColorTV extends TV {
	private int colors;

	public ColorTV(int colors, int size) {
		super(size);
		this.colors = colors;
	}
}

//////////////////////////////////////////9번
// (1)
abstract class A {
	abstract void f();
}

// (3)
abstract class B {
	abstract void f();
}
abstract class C extends B {
	
}

// (4)
abstract class B {
	abstract int f();
}

abstract class C extends B {
	int f() {
		System.out.println("~");
		return 0;
	}
}

//////////////////////////////////////////10번
abstract class OddDetector {
	protected int n;

	public OddDetector(int n) {
		this.n = n;
	}

	public abstract boolean isOdd(); // 홀수이면 true 리턴
}
*/
//////////////////////////////////////////11번
class A {
	int i;
}

class B extends A {
	int j;
}

class C extends B {
	int k;
}

class D extends B {
	int m;
}

//////////////////////////////////////////12번
class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	public void paint() {
//		draw();
		super.draw();
	}

	public void draw() {
		System.out.println("Circle");
	}
}

//////////////////////////////////////////16번
interface Device {
	void on();

	void off();
}

//public class TV implements Device {
//	public static void main(String[] args) {
//		TV myTV = new TV();
//		myTV.on();
//		myTV.watch();
//		myTV.off();
//	}
//
//	public void on() {
//		System.out.println("켜졌습니다.");
//	}
//
//	public void watch() {
//		System.out.println("방송중입니다.");
//	}
//
//	public void off() {
//		System.out.println("종료합니다.");
//	}
//}

public class Ch05_연습문제 {
//	10번
//	public Ch05_연습문제(int n) {
//		super(n);
//	}
//	
//	public boolean isOdd() {
//		if (n % 2 == 1)
//			return true;
//		else
//			return false;
//	}
//	
	public static void main10(String[] args) {
//		Ch05_연습문제 b = new Ch05_연습문제(10);
//		System.out.println(b.isOdd()); // B가 짝수이므로 false 출력
	}

	public static void main11(String[] args) {
		A x = new D();
		System.out.println(x instanceof B);
		System.out.println(x instanceof C);

		System.out.println(new D() instanceof Object);
		System.out.println("Java" instanceof Object);
	}

	public static void main12(String[] args) {
		Shape s = new Circle();
		s.draw();
	}

	public static void main(String[] args) {

	}
}
