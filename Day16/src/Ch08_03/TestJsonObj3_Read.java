package Ch08_03;

import java.io.IOException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TestJsonObj3_Read {
	
	public TestJsonObj3_Read() throws IOException {
		InputStream is = this.getClass().getResourceAsStream("members.json");
//		FileInputStream is = new FileInputStream("D://members.json");

//		JSONTokener tk = new JSONTokener(is);
//		JSONObject jObj = new JSONObject(tk);
		
//		System.out.println(jObj.toString(2));
	}

	public static void main(String[] args) throws IOException {
		new TestJsonObj3_Read();
	}

}














