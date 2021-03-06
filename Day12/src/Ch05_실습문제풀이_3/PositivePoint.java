package Ch05_실습문제풀이_3;

// 실습문제 8번

public class PositivePoint extends Point {

	public PositivePoint() {
		this(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(x, y);
		if(x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	
	@Override
	protected void move(int x, int y) {
		if(x >= 0 && y >= 0) {
			super.move(x, y);
		}
	}
	
	@Override
	public String toString() {
		// 객체를 사용하면 자동으로 호출된다
		return String.format("(%d, %d)의 점", getX(), getY());
	}
	
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p + "입니다.");
		
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2 + "입니다.");
	}

}
