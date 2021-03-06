package Ch05_실습문제풀이_2;

//실습문제 4번

public class Km2Mile extends Converter {
	
	private String srcString = "Km";
	private String destString = "Mile";
	
	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return srcString;
	}

	@Override
	protected String getDestString() {
		return destString;
	}
	
	public static void main(String[] args) {
		Km2Mile toMaile = new Km2Mile(1.6);
		toMaile.run();
	}

}
