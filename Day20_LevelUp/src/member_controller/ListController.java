package member_controller;

import member_view.MemberView;

public class ListController extends Controller {

	@Override
	public MemberView handlerMapping() {
		return list;
	}

}
