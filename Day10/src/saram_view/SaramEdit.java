package saram_view;

import saram.R;
import saram_model.SaramDao;
import saram_model.SaramVo;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
		System.out.println("::::: 사람 정보 수정 :::::");
		if (R.saramVo == null) {
			System.out.println("검색 결과 없습니다!");
			return;
		}
		System.out.println(R.saramVo);
		System.out.println("수정할 항목을 선택하세요.");
		System.out.println("1.이름 2.연락처 3.이메일 4.모두");
		int n = scan.nextInt();
		
		while(true) {
			if(n > 4 || n < 1) {
				System.out.println("선택한 숫자는 없습니다.");
				System.out.println("수정할 항목을 선택하세요.");
				System.out.println("1.이름 2.연락처 3.이메일 4.모두");
				n = scan.nextInt();
			}
			break;
		}

		switch (n) {
		case 1:
			System.out.print("수정할 이름>> ");
			R.saramVo.setName(scan.next());
			break;
		case 2:
			System.out.print("수정할 연락처>> ");
			R.saramVo.setPhone(scan.next());
			break;
		case 3:
			System.out.print("수정할 이메일>> ");
			R.saramVo.setEmail(scan.next());
			break;
		case 4:
			System.out.print("수정할 이름>> ");
			R.saramVo.setName(scan.next());
			System.out.print("수정할 연락처>> ");
			R.saramVo.setPhone(scan.next());
			System.out.print("수정할 이메일>> ");
			R.saramVo.setEmail(scan.next());
			break;
		default:
			System.out.println("선택한 숫자는 없습니다.");
		}
		
		/////////////////////////////////////////////////////////
		
/*		System.out.print("이름을 수정 하시겠습니까?(Y/N)");
		char yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 이름>> ");
			R.saramVo.setName(scan.next());
		}
		System.out.print("연락처를 수정 하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 연락처>> ");
			R.saramVo.setPhone(scan.next());
		}
		System.out.print("이메일을 수정 하시겠습니까?(Y/N)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 이메일>> ");
			R.saramVo.setEmail(scan.next());
		}
*/		
	}
}
