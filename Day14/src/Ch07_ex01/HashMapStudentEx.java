package Ch07_ex01;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	int id;
	String tel;
	
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("홍길동", new Student(1, "010-111"));
		map.put("김길동", new Student(2, "010-222"));
		map.put("고길동", new Student(3, "010-333"));
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름>> ");
			String name = scan.nextLine();
			
			if(name.equals("exit")) {
				System.out.println("종료됩니다.");
				break;
			}
			
			Student student = map.get(name);
			if(student == null)
				System.out.println(name + "는 없는 사람입니다.");
			else
				System.out.println("id:" + student.id + ", tel:" + student.tel);
		}
		scan.close();
	}

}
