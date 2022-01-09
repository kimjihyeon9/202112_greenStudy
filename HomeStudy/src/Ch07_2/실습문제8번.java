package Ch07_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// 이름 - String --> key
// 포인트 - int  --> value
public class 실습문제8번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("포인트 관리 프로그램입니다.");
		while(true) {
			String name = sc.next();
			if("그만".equals(name)) break;
			int num = sc.nextInt();
			if(map.get(name) == null) {
				map.put(name, num);
			}else {
				map.put(name, map.get(name)+num);
			}// 넣기 끝
			Set<String> key = map.keySet();
			Iterator<String> ik = key.iterator();
			while(ik.hasNext()) {
				name = ik.next();
				num = map.get(name);
				System.out.print("("+name+","+num+")");
			}
			System.out.println();
		}
		sc.close();
	}

}















