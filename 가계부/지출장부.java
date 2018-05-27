package 가계부;

public class 지출장부 {
	private int 지출예산, 지출금액, 누적지출, 지출차액, 지출비율;
	
	public void 지출예산_설정(int 지출예산) {
		this.지출예산 = 지출예산;
	}
	
	public int 지출금액_설정(String 항목, int 지출금액) {
		if( 항목.equals("지출") ) 
			this.지출금액 = 지출금액;
		return 지출금액;
	}
	public int 누적지출_설정(int 지출금액) {
		this.누적지출 = 지출금액;
		return 누적지출;
	}
	public void 지출차액비율_설정(int 지출차액, int 지출비율) {
		this.지출차액 = 지출차액;
		this.지출비율 = 지출비율;
	}
	public int 지출예산_반환() { return 지출예산; }
	public int 지출차액_반환() { return 지출차액; }
	public int 지출비율_반환() { return 지출비율; }
}
