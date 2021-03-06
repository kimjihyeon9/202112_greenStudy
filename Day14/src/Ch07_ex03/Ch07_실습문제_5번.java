package Ch07_ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Student {
	private String 이름;
	private String 학과;
	private String 학번;
	private String 학점평균;

	public Student() {
		this("", "", "", "");
	}

	public Student(String 이름, String 학과, String 학번, String 학점평균) {
		this.이름 = 이름;
		this.학과 = 학과;
		this.학번 = 학번;
		this.학점평균 = 학점평균;
	}

	public String get이름() {
		return 이름;
	}

//	@Override
//	public String toString() { 
//		return 이름 + "," + 학과 + "," + 학번 + "," + 학점평균;
//	}

	public String toString() {
		// toString() = String 인스턴스에 저장되어 있는 문자열을 반환
		// 생성자를 통해 이름과 성별을 초기화시켜줄 수 있도록 코드를 작성
		return "이름: " + 이름 + "\n학과: " + 학과 + "\n학번: " + 학번 + "\n학점평균: " + 학점평균;
	}

	public String toString(int i) {
		return 이름 + "," + 학과 + "," + 학번 + "," + 학점평균;
	}
}

public class Ch07_실습문제_5번 {
	public static Scanner scan = new Scanner(System.in);
//	public static ArrayList<Student> sList = new ArrayList<Student>();
	public static HashMap<String, Student> smap = new HashMap<String, Student>();
//	public static Vector<Student> sv = new Vector<Student>();

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String 정보 = scan.nextLine();
			StringTokenizer st = new StringTokenizer(정보, ","); // 문자열을 구분자를 기준으로 여러개의 문자열(토큰)로 잘라내는데 사용

			String 이름 = st.nextToken();
			String 학과 = st.nextToken();
			String 학번 = st.nextToken();
			String 학점평균 = st.nextToken();

			smap.put(이름, new Student(이름, 학과, 학번, 학점평균));
		}
		// Iterator = 컬렉션에 저장된 각 요소에 접근하는 기능..?
		Set<String> s = smap.keySet();
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println("------------------------");
			System.out.println(smap.get(it.next()).toString());
		}
		System.out.println();

		System.out.println("찾는 이름을 입력하세요");
		System.out.println("(그만 입력시 종료)");
		while (true) {
			System.out.print("학생 이름 >> ");
			String 이름 = scan.nextLine();

			if ("그만".equals(이름)) {
				break;
			}

			if (smap.get(이름) != null) {
				System.out.println(smap.get(이름).toString(0));
			} else {
				System.out.println("없는 정보입니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료!");
		scan.close();
	}

}
