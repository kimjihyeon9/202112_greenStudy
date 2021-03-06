package PeopleModel;

// 유효성검사 - 숫자범위, 숫자문자판별(try/catch이용)
// 추가, 출력, 검색, 수정, 삭제, 종료
// 패키지 나누기

import java.util.Scanner;

class People {
	private int no;
	private String name;
	private String phone;
	private String email;
	
	public People(int no, String name, String phone, String email) {
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

////////////////////////////////////////////////////////

class DataModel {
	public static final int MAX = 10;
	private People[] peopleList = new People[MAX];
	private int top = 0;
	
	public void addPeople(People people) {
		if(people != null) {
			peopleList[top++] = people;
			System.out.println("입력 성공!");
		}
	}
	
	public People[] getAllPeople() {
		return peopleList;
	}
	
	public People findPeople(People people) {
		People findPeople = null;
		for(int i = 0; i < top; i++) {
			if((people.getName()).equals(peopleList[i].getName())) {
				findPeople = peopleList[i];
			}
		}
		return findPeople;
	}
	
	public void editPeople (People people) {
		People editPeople = null;
		for(int i = 0; i < top; i++) {
			if((people.getName()).equals(peopleList[i].getName())) {
				editPeople = peopleList[i];
			}
		}
//		return null;
	}
	
	public People removePeople(int index) {
		People people = peopleList[index];
		for(int i = index; i < top - 1; i++) {
			peopleList[i] = peopleList[i + 1];
		}
		top--;
		peopleList[top] = null;
		return people;
	}
}

///////////////////////////////////////////////////

class R {
	public static int no;
	public static People people;
	public static People[] peopleList;
	
	public static View menu = new Menu();
	public static View addPeople = new AddPeople();
	public static View list = new PeopleList();
	public static View findPeople = new FindPeople();
	public static View editPeople = new EditPeople();
	public static View remove = new RemovePeople();
	
	public static DataModel dm = new DataModel();
}

//////////////////////////////////////////////////////

class View {
	public Scanner scan = new Scanner(System.in);
	
	public void display() {
		
	}
}

class Menu extends View { // controller로 분리하기 - try/catch 부분
	@Override
	public void display() {
		System.out.println("MENU ---------------------------------");
		System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
		System.out.print("선택해주세요 >> ");
		int no = scan.nextInt();
		try {
			if(no > 6 || no < 1) {
				System.out.println("범위에 없는 숫자입니다.");
				System.out.println("다시 입력해주세요>> ");
				no = scan.nextInt();
			}
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
			System.out.println("다시 입력해주세요>> ");
			no = scan.nextInt();
		}
		R.no = no;
	}
}

class AddPeople extends View {
	@Override
	public void display() {
		System.out.println("ADD --------------------------------------");
		System.out.print("이름>> ");
		String name = scan.next();
		System.out.print("전화번호>> ");
		String phone = scan.next();
		System.out.print("이메일>> ");
		String email = scan.next();
		R.people = new People(0, name, phone, email);
	}
}

class PeopleList extends View {
	@Override
	public void display() {
		System.out.println("People List ----------------------------------");
		for(People people : R.peopleList) {
			if(people == null)
				break;
		}
	}
}

class FindPeople extends View {
	@Override
	public void display() {
		System.out.println("FIND -----------------------------------------");
//		if()
	}
}

class EditPeople extends View {
	@Override
	public void display() {
		System.out.println("EDIT ----------------------------------------");
	}
}

class RemovePeople extends View {
	public void display() {
		System.out.println("REMOVE ----------------------------------------");
		
	}
}

public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		while(true) {
			m.display();
		}
	}

}
