package Address_controller;

import java.io.IOException;

import Address.R;
import Address.ViewContainer;
import Address_model.AddressDao;
import Address_view.AddrView;

public class AddressController extends AddrView {
	private ViewContainer vc = new ViewContainer();
	private AddressDao dao = new AddressDao();
	
	public void run() throws IOException, ClassNotFoundException {
		System.out.println("-------------------------- 메뉴 --------------------------");
		System.out.println("1.등록 2.조회 3.검색 4.수정 5.삭제 6.종료");
		System.out.print(">> ");
		int no = scan.nextInt();
		
		// 유효성검사

		switch (no) {
		case 1:
			vc.run(R.add);
			dao.add(R.addressvo);
			break;
		case 2:
			R.addressList = dao.listAll();
			vc.run(R.list);
			break;
		case 3:
			vc.run(R.search);
			R.addressvo = dao.search(R.addressvo);
			vc.run(R.detail);
			break;
		case 4:
			vc.run(R.search);
			R.addressvo = dao.search(R.addressvo);
			vc.run(R.edit);
			if(R.addressvo != null) {
				dao.edit(R.addressvo);
			}
			break;
		case 5:
			vc.run(R.search);
			R.addressvo = dao.search(R.addressvo);
			vc.run(R.delete);
			if(R.addressvo != null) {
				dao.delete(R.addressvo);
			}
			break;
		case 6:
			dao.end();
			break;
		default:
			System.out.println("해당 번호는 없는 번호입니다.");
			break;
		}
		dao.save();
		R.no = 0;
		run();
	}
}
