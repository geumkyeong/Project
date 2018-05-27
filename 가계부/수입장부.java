package 가계부;

public class 수입장부 {
	private int 수입예산, 수입금액, 누적수입, 수입차액, 수입비율;
	
	public void 수입예산_설정(int 수입예산) {
		this.수입예산 = 수입예산;
	}
	
	public int 수입금액_설정(String 항목, int 수입금액) {
		if( 항목.equals("수입") ) 
			this.수입금액 = 수입금액;
		return 수입금액;
	}
	public int 누적수입_설정(int 수입금액) {
		this.누적수입 = 수입금액;
		return 누적수입;
	}
	public void 수입차액비율_설정(int 수입차액, int 수입비율) {
			this.수입차액 = 수입차액;
			this.수입비율 = 수입비율;
	}
	public int 수입예산_반환() { return 수입예산; }
	public int 수입차액_반환() { return 수입차액; }
	public int 수입비율_반환() { return 수입비율; }
}
