package Ch07_ex02_menu;

import java.util.HashMap;
import java.util.Scanner;

class Menu {
	public static int no;
	public static Scanner scan = new Scanner(System.in);

	public static void display(String[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.print(i + 1 + "." + items[i] + " ");
		}
//		System.out.println("1.게시판 2.갤러리 3.주소록 4.종료");
		System.out.print("\n선택 : ");
		no = scan.nextInt();

		while (no < 1 || no > items.length) {
			System.out.println("입력 범위를 초과했습니다!!");
			System.out.print("다시 선택 : ");
			no = scan.nextInt();
		}
	}
}

abstract class Controller {
	public abstract void run();
}

class BoardController extends Controller {
	@Override
	public void run() {
		System.out.println(":::: BOARD ::::");
		 
		String[] menuItems = new String[] { "입력", "목록", "상세보기", "수정", "삭제" };
		Menu.display(menuItems);
		System.out.print(Menu.no + " => ");
		System.out.println(menuItems[Menu.no - 1]);
	}
}

class GalleryController extends Controller {
	@Override
	public void run() {
		System.out.println(":::: GALLERY ::::");

		String[] menuItems = new String[] { "사진등록", "사진목록", "사진보기" };
		Menu.display(menuItems);
		System.out.print(Menu.no + " => ");
		System.out.println(menuItems[Menu.no - 1]);
	}
}

class AddressController extends Controller {
	@Override
	public void run() {
		System.out.println(":::: ADDRESS ::::");
		
		String[] menuItems = new String[] { "주소등록", "주소검색", "주소삭제" };
		Menu.display(menuItems);
		System.out.print(Menu.no + " => ");
		System.out.println(menuItems[Menu.no - 1]);
	}
}

class EndController extends Controller {
	@Override
	public void run() {
		System.out.println(":::: END ::::");
		
		String[] menuItems = new String[] { "저장 후 종료", "그냥 종료", "취소" };
		Menu.display(menuItems);
		System.out.print(Menu.no + " => ");
		System.out.println(menuItems[Menu.no - 1]);
		
		if(Menu.no != 3) {
			System.exit(0);
		}
	}
}

public class DispatcherEx {
	private HashMap<String, Controller> map = new HashMap<String, Controller>();
	String[] menuItems = new String[] { "게시판", "갤러리", "주소록", "종료" };{
		map.put(menuItems[0], new BoardController());
		map.put(menuItems[1], new GalleryController());
		map.put(menuItems[2], new AddressController());
		map.put(menuItems[3], new EndController());
	}

	public DispatcherEx() {
		action();
	}

	private void action() {
		// 메뉴 보여준다.

		Menu.display(menuItems);
		map.get(menuItems[Menu.no - 1]).run();; // 선택한 Controller가 실행된다

		// 재귀호출
		action();
	}

	public static void main(String[] args) {
		new DispatcherEx();
	}

}
