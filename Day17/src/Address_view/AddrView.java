package Address_view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AddrView {
	public static Scanner scan = new Scanner(System.in);

	public void display() {
		System.out.println("display");
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
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9' || ch == '-') {
				s2.append(ch);
			}
		}
		return Integer.parseInt(s2.toString());
	}
}
