package Day13_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class Point{
	int x, y;

	public Point(int i, int j) {
		x = i;
		y = j;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
//	public boolean equals(Object obj) {
//		if(obj instanceof Point) {
//			Point p = (Point)obj;
//			if(p.x == this.x && p.y == this.y) {
//				return true;
//			}
//		}
//		return false;
//	} // end of equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	@Override
	public String toString() {
//		return String.format("Point(%d, %d)", x, y);
		return String.format("(%d, %d)", x, y);
	}
	
}

public class Ch05_Ex03 {

	public static void test(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		System.out.println(a == b); // false <-- 인스턴스의 참조값 비교
		System.out.println(a.equals(b)); // true
		System.out.println(a.equals(c)); // false
	}
	
	public static void main(String[] args) {
		ArrayList<Point> pList = new ArrayList<Point>(); // 배열같은 구조 index (순서)
		pList.add(new Point(2, 3));
		pList.add(new Point(4, 5));
		pList.add(new Point(6, 7));
		pList.add(new Point(8, 9));
		pList.add(new Point(1, 2));
		
//		System.out.println(pList);
		System.out.println(pList.get(1));
		pList.set(1, new Point(100, 200));
		System.out.println(pList.get(1));
		System.out.println(pList);
		System.out.println("size => " + pList.size());
		System.out.println();
		
		// 컬렉션의 결과를 배열로 쉽게 변경할 수 있다.
		Point[] arr = new Point[pList.size()];
		pList.toArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// indexOf() <-- 같은 요소가 있다면 index반환, 아니면 -1 반환
		// ArrayList에서 객체의 위치를 찾기위해서는 equals()를 재정의 해야한다.
		// 다른 컬렉션에서도 검색이 가능하려면 hashcode도 재정의 해야한다
		System.out.println(pList.indexOf(new Point(6, 7)));
		System.out.println(pList.contains(new Point(1, 2)));
		System.out.println(pList.contains(new Point(40, 5)));
	}

}
