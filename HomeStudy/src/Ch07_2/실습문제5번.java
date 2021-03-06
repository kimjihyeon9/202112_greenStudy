package Ch07_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Student{
	private String name;
	private String sub;
	private String num;
	private double avg;
	
	public Student() {
		this("", "", "", 0);
	}
	
	public Student(String name, String sub, String num, double avg) {
		this.name = name;
		this.sub = sub;
		this.avg = avg;
		this.num = num;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n학과: " + sub + "\n학번" + num + "\n학점평균: " + avg;
	}

	public String toString(int i) { // 이름이 toString이라고 안해도 된당
		return name + ", " + sub + ", " + num + ", " + avg;
	}
}

public class 실습문제5번 {
	public static Scanner scan = new Scanner(System.in);
	public static HashMap<String, Student> smap = new HashMap<String, Student>();

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String info = scan.nextLine();
			StringTokenizer st = new StringTokenizer(info, " ");
			
			String name = st.nextToken().trim();
			String sub = st.nextToken().trim();
			String num = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());
			
			smap.put(name, new Student(name, sub, num, avg));
		}
		
		Set<String> ss = smap.keySet(); // Set<> : 배열처럼 집합계념, 인터페이스여서 객체를 받지못함, Map은 Iterator가 없어서 Set을 이용해 key를 빼온다!!
		Iterator<String> it = ss.iterator();
		while(it.hasNext()) {
			System.out.println("---------------------");
			System.out.println(smap.get(it.next()));
		}
		
		System.out.println("검색할 이름을 입력하세요.");
		System.out.println("(그만 입력시 종료)");
		while(true) {
			System.out.print(">> ");
			String name = scan.next();
			
			if("그만".equals(name)) break;
			
//			if((smap.get(name).getName()).equals(name)) { // key값이 없으면 이상한 값이 나옴(에러생김)
			if(smap.containsKey(name)) { // 이게 더 안전함
				System.out.println(smap.get(name).toString(0));
			} else {
				System.out.println("없습니다");
			}
		}
		System.out.println("종료합니다");
		scan.close();
	}

}















