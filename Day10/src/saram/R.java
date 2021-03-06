package saram;

import saram_controller.SaramController;
import saram_model.SaramVo;
import saram_view.InsertView;
import saram_view.MenuView;
import saram_view.SaramDatail;
import saram_view.SaramDelete;
import saram_view.SaramEdit;
import saram_view.SaramListView;
import saram_view.SaramView;
import saram_view.SearchByName;

public class R {
	public static int no;
	public static SaramVo saramVo;
	public static SaramVo[] saramArr;
	
	public static final SaramView searchByName = new SearchByName(); 
	
	public static final SaramView menuView = new MenuView();
	
	public static final SaramView insertView = new InsertView();
	public static final SaramView saramDelete = new SaramDelete();
	public static final SaramView saramDetail = new SaramDatail();
	public static final SaramView saramEdit = new SaramEdit();
	public static final SaramView saramListView = new SaramListView();
	
	public static final SaramController saramController = new SaramController();
}
