package Address;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Address_controller.AddressController;
import Address_model.AddressVo;
import Address_view.AddView;
import Address_view.AddrView;
import Address_view.AddressDatail;
import Address_view.DeleteView;
import Address_view.EditView;
import Address_view.ListView;
import Address_view.SearchView;

public class R {
	public static int no;
	public static AddressVo addressvo;
	public static ArrayList<AddressVo> addressList;
	
	public static final AddrView add = new AddView();
	public static final AddrView list = new ListView();
	public static final AddrView detail = new AddressDatail();
	public static final AddrView search = new SearchView();
	public static final AddrView edit = new EditView();
	public static final AddrView delete = new DeleteView();
	
	public static final AddressController addressController = new AddressController();
}
