package Day20_6;

import java.util.Vector;

public class SaramDAO {
	public static Vector<SaramDTO> saramList = new Vector<SaramDTO>();
	static {
		saramList.add(new SaramDTO(1, "kim", "kim@aaa.com", "010-1111-1111"));
		saramList.add(new SaramDTO(2, "lee", "lee@aaa.com", "010-2222-2222"));
		saramList.add(new SaramDTO(3, "park", "park@aaa.com", "010-3333-3333"));
	}
	public static int sequence = 4;
	
	public Vector selectAll() {
		Vector vector = new Vector();
		for(int i = 0; i < saramList.size(); i++) {
			vector.add(saramList.get(i).toVector());
		}
		return vector;
	}
}
