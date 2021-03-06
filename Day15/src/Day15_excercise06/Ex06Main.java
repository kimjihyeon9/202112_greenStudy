package Day15_excercise06;

// 실습문제 6번

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex06Main {
	private HashMap<String, Location> locMap = new HashMap<String, Location>();{
		locMap.put("서울", new Location("서울", 37, 126));
		locMap.put("LA", new Location("LA", 34, -118));
		locMap.put("파리", new Location("파리", 2, 48));
		locMap.put("시드니", new Location("시드니", 151, -33));
	}
	private Scanner scan;
	public static final int MAX = 4;
	public Ex06Main() {
//		input();
//		System.out.println(locMap);
		list();
		while(true) {
			Location loc = search();
			if("그만".equals(loc.get도시())) break;
			System.out.println(loc == null ? "도시가 없습니다." : loc);
		}
	}
	
	private void list() {
		Set<String> keys = locMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String 도시 = it.next();
			System.out.println(locMap.get(도시));
		}
	}

	private Location search() {
		if(scan == null) scan = new Scanner(System.in);
		System.out.print("도시 이름 >> ");
		String 도시 = scan.next();
		if("그만".equals(도시)) {
			return new Location("그만", 0, 0);
		}
		if(locMap.get(도시) == null) {
			return null;
		}
		return locMap.get(도시);
	}

	private void input() {
		if(scan == null) scan = new Scanner(System.in);
		System.out.println("4개 도시의 도시, 위도, 경도를 입력하세요.");
		for(int i = 0; i < MAX; i++) {
			System.out.print(">> ");
			String value = scan.nextLine();
			StringTokenizer st = new StringTokenizer(value, ", ");
			String 도시 = st.nextToken();
			int 위도 = Integer.parseInt(st.nextToken());
			int 경도 = Integer.parseInt(st.nextToken());
			Location loc = new Location(도시, 위도, 경도);
			locMap.put(도시, loc);
		}
		scan.close();
	}

	public static void main(String[] args) {
		new Ex06Main();
	}

}
