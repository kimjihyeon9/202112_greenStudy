package Address_view;

import Address.R;

public class DeleteView extends AddrView {
	@Override
	public void display() {
		System.out.println("-------------------------- 삭제 --------------------------");
		
		if(R.addressvo == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		System.out.println(R.addressvo);
		System.out.print("정말로 삭제 하시겠습니까? [y / n] ");
		char yn = scan.next().charAt(0);
		if(yn == 'n') {
			R.addressvo = null;
			System.out.println("취소되었습니다.");
		} else {
			System.out.println("삭제되었습니다.");
		}
	}
}
