package Day12;

import java.util.Scanner;

//////////////////////////////////////////1번
class TV{
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int colorC;
	
	public ColorTV(int size, int colorC) {
		super(size);
		this.colorC = colorC;
	}

	public void printProperty() {
		System.out.printf("%d인치 %d컬러", getSize(), colorC);
	}
}

//////////////////////////////////////////2번
class IPTV extends ColorTV{
	private String address;
	
	public IPTV(String address, int size, int colorC) {
		super(size, colorC);
		this.address = address;
	}
	
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 ", address);
		super.printProperty();
	}
}

//////////////////////////////////////////3번
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; // 비율
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scan.nextDouble();
		double res = convert(val);
		
		System.out.println("반환 결과 : " + res + getDestString() + "입니다");
		scan.close();
	}
}

class Won2Dollar extends Converter{
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
}

//////////////////////////////////////////4번
class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
}

//////////////////////////////////////////5번
class Point{
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint1 extends Point{
	private String color;
	
	public ColorPoint1(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String s = color + "색의 " + "(" + getX() + ", " + getY() +")의 점";
		return s;
	}
}

//////////////////////////////////////////6번
class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super(0, 0);
		this.color = "BLACK";
	}

	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String s = color + "색의 " + "(" + getX() + ", " + getY() +")의 점";
		return s;
	}
	
}

//////////////////////////////////////////7번
class Point3D extends Point{
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void moveUp() {
		z++;
	}

	public void moveDown() {
		z--;
	}

	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	public String toString() {
		String s = "(" + getX() + ", " + getY() + ", " + z +") 의 점";
		return s;
	}
}

//////////////////////////////////////////8번
class PositvePoint extends Point{
	public PositvePoint() {
		super(0, 0);
	}
	
	public PositvePoint(int x, int y) {
		super(x, y);
		if(!(x > 0 && y > 0)) {
			super.move(0, 0);
		}
	}
	
	public void move(int x, int y) {
		if(x > 0 && y > 0) {
			super.move(x, y);
		}
	}
	
	public String toString() {
		String s = "(" + getX() + ", " + getY() + ") 의 점";
		return s;
	}
}

//////////////////////////////////////////9번
interface Stack{ // LIFO(Last In Fist Out)
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 top에 실수 저장
	boolean pust(String val); // 스택의 top에 저장된 실수 리턴
}

class StringStack implements Stack{

	@Override
	public int length() {
		return 0;
	}

	@Override
	public int capacity() {
		return 0;
	}

	@Override
	public String pop() {
		return null;
	}

	@Override
	public boolean pust(String val) {
		return false;
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int l = scan.nextInt();
		
		for(int i = 0; i < 100; i++) {
			if(i >= l) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
			System.out.print("문자열 입력 >> ");
			String p = scan.next();
			if(p.equals("그만")) {
				break;
			}
		}
		System.out.printf("스택에 저장된 모든 문자열 팝 : %s", pust(null));
		
		scan.close();
	}
	
}

public class Ch05_실습문제 {

	public static void main01(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
	
	public static void main02(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		// "192.1.1.2" 주소에 32인치, 2048 컬러
		
		iptv.printProperty();
	}
	
	public static void main03(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
	}
	
	public static void main04(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();
	}
	
	public static void main05(String[] args) {
		ColorPoint1 cp = new ColorPoint1(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
	
	public static void main06(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0)위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10); //(10,10)위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
	
	public static void main07(String[] args) {
		Point3D p = new Point3D(1, 2, 3); // 1, 2, 3 은 각각 x, y, z 축의 값
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp(); // z축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown(); // z축으로 아래쪽 이동
		p.move(10, 10); // x, y축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300); // x, y, z축으로 이동
		System.out.println(p.toString() + "입니다.");
	}
	
	public static void main08(String[] args) {
		PositvePoint p = new PositvePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositvePoint p2 = new PositvePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
	
	public static void main(String[] args) {
		StringStack ss = new StringStack();
		ss.run();
	}

}
