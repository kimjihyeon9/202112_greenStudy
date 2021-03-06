package Ch05_실습문제풀이_3;

// 실습문제 5번, 6번

public class ColorPoint extends Point {
	
	private String color;

	public ColorPoint(int x, int y, String color) { // 생성자 오버로딩
		super(x, y);
		this.color = color;
	}

	public ColorPoint() { // default 생성자
		this(0, 0, "BLACK"); // 다른생성자 호출
	}

	private void setColor(String color) {
		this.color = color;
	}

	private void setXY(int x, int y) {
		super.move(x, y);
	}
	
	@Override
	public String toString() {
		// 객체를 사용하면 자동으로 호출된다
		return String.format("%s색의 (%d, %d)의 점", color, getX(), getY());
	}
	
	public static void test_01(String[] args) { // 실습문제 5번
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
//		String str = cp.toString();
		System.out.println(cp + "입니다.");
	}
	
	public static void main(String[] args) { // 실습문제 6번
		ColorPoint zeroPoint = new ColorPoint(); // (0,0)위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		test_01(null);
	}
}
