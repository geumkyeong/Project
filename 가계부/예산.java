package 가계부;

public class 예산 {
	private int 수입예산, 지출예산;
	
	public void 수입예산_관리(int 수입예산) {
	  this.수입예산 = 수입예산;
	}
	public void 지출예산_관리(int 지출예산) {
	  this.지출예산 = 지출예산;
	}
	
	public int 수입예산_반환() { return 수입예산; }
	public int 지출예산_반환() { return 지출예산; }
}
