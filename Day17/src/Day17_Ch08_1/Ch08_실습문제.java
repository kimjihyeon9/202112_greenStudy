package Day17_Ch08_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ch08_실습문제 {
	public static void main01(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		File file = new File("C:\\temp\\phone.txt");
		FileWriter writer = new FileWriter(file);

		System.out.println("전화번호 입력 프로그램입니다.");
		while (true) {
			System.out.print("이름 전화번호 >> ");
			String s = scan.nextLine();
			if ("그만".equals(s)) {
				System.out.println("C:\\temp\\phone.txt에 저장하였습니다.");
				break;
			}
			writer.write(s);
			writer.write("\n");
		}
		writer.close();
	}

	public static void main02(String[] args) throws IOException {
		File file = new File("C:\\temp\\phone.txt");
		FileReader read = new FileReader(file);
		BufferedReader br = new BufferedReader(read);

		System.out.println("C:\\temp\\phone.txt를 출력합니다.");

		String data = null;
		try {
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main03(String[] args) throws IOException {
		File file = new File("C:\\windows\\system.ini");
		try {
			FileReader read = new FileReader(file);
			int c;
			while ((c = read.read()) != -1) {
				c = Character.toUpperCase(c);
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		String line;
//		line = line.toUpperCase();
	}

	public static void main(String[] args) throws IOException {
		Scanner fScan = new Scanner(new FileReader("C:\\windows\\system.ini"));
//		while(scan.hasNext()) { // 파일에 읽을 내용이 있는 동안
		String line = fScan.nextLine(); // 파일에서 한 라인 읽기
	}

}






















