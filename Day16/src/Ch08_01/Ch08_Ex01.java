package Ch08_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch08_Ex01 {
	
	public static void main01(String[] args) { // scanner 테스트(문자열을 넣어도 되고 파일을 넣어도 된다)
		Scanner scan = new Scanner("우리나라 대한민국\n 만세 true 나라사랑\n 가족사랑 false");
		
//		while(scan.hasNext()) {
//			System.out.println(scan.next());
//		}
//		while(scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
//		}
		while(scan.hasNext()) {
			if(scan.hasNextBoolean()) {
				System.out.println(scan.nextLine());
			} else {
				scan.next();
			}
		}
	}
	
	
	public static void main02(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// 여기 두줄은 외우는게 편하다
		
		// throws와 try/catch를 같이쓰면 try/catch가 먼저 실행된다
		// 내용이 뭐가 들어올지 몰라서 예외가 발생한다(예외처리 해야함)
//		try {
//			System.out.print("성명입력 : ");
//			String name = br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.print("성명입력 : ");
		String name = br.readLine();
		System.out.println(name);
	}
	
	public static String getLine() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int getNum() {
		String s = getLine();
		StringBuffer s2 = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch > '0' && ch < '9') {
				s2.append(ch);
			}
		}
		return Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		System.out.print("주소 입력 : ");
		String addr = getLine();
		
		System.out.print("나이 입력 : ");
		int age = getNum();
		
		System.out.println("입력된 주소는 " + addr);
		System.out.println("입력된 나이는 " + age);
	}

}













