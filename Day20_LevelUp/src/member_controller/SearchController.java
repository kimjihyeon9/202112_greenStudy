package member_controller;

import member_view.MemberView;

public class SearchController extends Controller {

	@Override
	public MemberView handlerMapping() {
		return search;
	}

}
