package Ch07_ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Ch07_실습문제 {
	// 1번
	private static void ex01() {
		Vector<Integer> iv = new Vector<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 (-1이 입력될 때까지)>> ");
		int max = 0;
		while (true) {
			int n = scan.nextInt();
			if (n == -1)
				break;
			if (max < n) {
				max = n;
			}
		}
		System.out.println("가장 큰 수는 " + max);
		scan.close();
	}

	public static void main01(String[] args) {
		ex01();
	}

	// 2번
	public static void main02(String[] args) {
		ex02();
	}

	private static void ex02() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> scoreList = new ArrayList<Character>();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		for (int i = 0; i < 6;) {
			char ch = 0;
			ch = scan.next().charAt(0);
			if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F') {
				scoreList.add(ch);
				i++;
			}
		}
		scan.close();

		double sum = 0;
		Iterator<Character> it = scoreList.iterator();
		while (it.hasNext()) {
			Character score = it.next();
			sum += (69 - score) < 0 ? 0 : (double) (69 - score);
		}
		System.out.println(sum / 6);
	}

	private static void ex02_() {
		// 학점을 받는 문법(문장)
		ArrayList<Character> scoreList = new ArrayList<Character>();
		Scanner scan = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		for (int i = 0; i < 6;) {
			Character ch = 0;
			ch = scan.next().charAt(0);
			if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F') {
				scoreList.add(ch);
				i++;
			}
		}
		scan.close();

		// 입력받은 학점의 평균을 계산하는 문법(문장)
		Iterator<Character> it = scoreList.iterator();
		double sum = 0;
		while (it.hasNext()) {
			Character score = it.next();
			sum += (69 - score) < 0 ? 0 : (double) (69 - score); // 아스키코드(69)값으로 하는것
		}
		System.out.println("평균 = " + sum / 6);
	}

	// 3번
	public static void main03(String[] args) {
		ex03();
	}

	private static void ex03() {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000");
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("나라 이름, 인구 >> ");
			String 나라이름 = scan.next();
			if ("그만".equals(나라이름))
				break;
			int 인구 = scan.nextInt();
			nations.put(나라이름, 인구);
		}

		while (true) {
			System.out.print("인구 검색 >> ");
			String 나라이름 = scan.next();
			if ("그만".equals(나라이름))
				break;
			if (nations.containsKey(나라이름)) {
				System.out.println(나라이름 + "의 인구는 " + nations.get(나라이름));
			} else {
				System.out.println(나라이름 + "나라는 없습니다.");
			}
		}
	}

	// 4번
	public static void main04(String[] args) {
		ex04();
	}

	private static void ex04() {
		Vector<Integer> iv = new Vector<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		double avg = 0;
		int i = 1;
		while (true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			n = scan.nextInt();
			if (n == 0)
				break;
			sum += n;
			avg = sum / i;
			iv.add(n);
			System.out.println(iv);
			System.out.println("현재 평균 " + avg);
			i++;
		}
	}
	
	// 5번 - 다른클래스에서 구현
//	public static void main(String[] args) {
//		ex05();
//	}
//
//	private static void ex05() {
////		ArrayList<Student> student = new ArrayList<Student>();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
//		System.out.print(">> ");
//		ArrayList<Student> st = new ArrayList<Student>();
//	}
	
	// 8번
	public static void main(String[] args) {
		ex08();
	}

	private static void ex08() {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> point = new HashMap<String, Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
//		String 이름 = "";
//		int 포인트 = 0;
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String 이름 = scan.next();
			if("그만".equals(이름)) break;
			int 포인트 = scan.nextInt();
			
			if(point.containsKey(이름)) {
				point.put(이름, point.get(이름) + 포인트);
			} else {
				point.put(이름, 포인트);
			}
			
			Set<String> key = point.keySet();
			Iterator<String> it = key.iterator();
			while(it.hasNext()) {
				이름 = it.next();
				포인트 = point.get(이름);
				System.out.printf("(%s, %d)", 이름, 포인트);
			}
//			System.out.println(이름 + point.get(이름));
			System.out.println();
		}
	}
}


























