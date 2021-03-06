package Ch07_ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	private String c;
	private double g;
	private double w;
	
	public Location() {
		this("", 0, 0);
	}
	
	public Location(String c, double g, double w) {
		this.c = c;
		this.g = g;
		this.w = w;
	}

	public String getC() {
		return c;
	}
	
	@Override
	public String toString() {
		return c + "\t" + g + "\t" + w;
	}
}

public class Ch07_실습문제_6번 {
	public static Scanner scan = new Scanner(System.in);
	public static HashMap<String, Location> lmap = new HashMap<String, Location>();
	
	public static void main(String[] args) {
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String info = scan.nextLine();
			StringTokenizer st = new StringTokenizer(info, ",");
			
			String c = st.nextToken();
			double g = Double.parseDouble(st.nextToken());
			double w = Double.parseDouble(st.nextToken());
			
			Location l = new Location(c, g, w);
			lmap.put(c, l);
		}
		Set<String> keys = lmap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String c = it.next();
			System.out.println(lmap.get(c));
		}
		
		while(true) {
			System.out.print("도시 이름 >> ");
			String c = scan.nextLine();
			if("그만".equals(c)) {
				System.out.println("종료합니다.");
				return;
			}
			
			if(lmap.get(c) != null) 
				System.out.println(lmap.get(c));
			else
				System.out.println("없는 도시입니다");
		}
		
	}

}























