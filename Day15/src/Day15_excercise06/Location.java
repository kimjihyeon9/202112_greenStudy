package Day15_excercise06;

public class Location {
	private String 도시;
	private int 위도;
	private int 경도;
	
	public Location() {
		this("", 0, 0);
	}
	
	public Location(String 도시, int 위도, int 경도) {
		this.도시 = 도시;
		this.위도 = 위도;
		this.경도 = 경도;
	}
	
	public String get도시() {
		return 도시;
	}

	public int get위도() {
		return 위도;
	}

	public int get경도() {
		return 경도;
	}

	@Override
	public String toString() {
		return 도시 + " " + 위도 + " " + 경도;
	}
}
