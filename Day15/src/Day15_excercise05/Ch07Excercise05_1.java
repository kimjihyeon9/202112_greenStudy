package Day15_excercise05;

// 실습문제 5번

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Iterator;

class Student{
	String 이름;
	String 학과;
	String 학번;
	String 평균;
	
	public Student() {
		this("", "", "", "");
	}

	public Student(String 이름, String 학과, String 학번, String 평균) {
		this.이름 = 이름;
		this.학과 = 학과;
		this.학번 = 학번;
		this.평균 = 평균;
	}

	public String get이름() {
		return 이름;
	}

	@Override
	public String toString() {
		return 이름 + "," + 학과 + "," + 학번 + "," + 평균;
	}
	public String toString(int i) {
		return "이름: " + 이름 + "\n학과: " + 학과 + "\n학번: " + 학번 + "\n학점평균: " + 평균;
	}
	
}

public class Ch07Excercise05_1 {
	public static final int MAX = 4;
	public static Scanner scan;
	private Vector<Student> sv = new Vector<Student>();
	   {
	      sv.add(new Student("황기태","모바일","1","4.1"));
	      sv.add(new Student("이재문","안드로이드","2","3.9"));
	      sv.add(new Student("김남윤","웹공학","3","3.5"));
	      sv.add(new Student("최찬미","빅데이터","4","4.25"));
	   }

	public Ch07Excercise05_1() {
		start();
	}
	
	private void start() {
		if(scan == null) {
			scan = new Scanner(System.in);
		}
		// 4명의 학생 정보 입력
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i = 0; i < MAX; i++) {
			System.out.print(">> ");
			String info = scan.nextLine();
			StringTokenizer st = new StringTokenizer(info, ",");
			String 이름 = st.nextToken().trim();
			String 학과 = st.nextToken().trim();
			String 학번 = st.nextToken().trim();
			String 평균 = st.nextToken().trim();
			sv.add(new Student(이름, 학과, 학번, 평균));
		}
		Iterator<Student> it = sv.iterator();
		while(it.hasNext()) {
			System.out.println("------------------------");
			System.out.println(it.next().toString(0));
		}
		
		while(true) {
			System.out.print("학생이름 >> ");
			String 이름 = scan.nextLine();
			if("그만".equals(이름)) {
				break;
			}
			int idx = sv.indexOf(new Student(이름, null, null, null));
			if(idx != -1) {
				System.out.println(sv.get(idx));
			} else {
				System.out.println(이름 + " 학생은 없습니다!");
			}
		}
		System.out.println("프로그램 종료!!");
		scan.close();
	}

	public static void main(String[] args) {
		new Ch07Excercise05_1();
	}

}
