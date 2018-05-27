package 가계부;

public class 계산기 {
	private int 수입금액, 지출금액, 누적수입, 누적지출, 누적잔액, 수입차액, 수입비율, 지출차액, 지출비율;
	
	public void 누적금액_계산(String 항목, int 수입금액, int 지출금액) {
		if( 항목.equals("수입") ) 
			누적수입 += 수입금액;
		else if( 항목.equals("지출") ) 
			누적지출 += 지출금액;
		누적잔액 = 누적수입 - 누적지출;
	}
	public void 차액비율_계산(int 수입예산, int 누적수입, int 지출예산, int 누적지출) {
		수입차액 = 수입예산 - 누적수입;
		지출차액 = 지출예산 - 누적지출;
		수입비율 = (int)((double) 수입차액 / (double) 수입예산 * 100);
		지출비율 = (int)((double) 지출차액 / (double) 지출예산 * 100);
	}
	
	public int 누적수입_반환() { return 누적수입; }
	public int 누적지출_반환() { return 누적지출; }
	public int 누적잔액_반환() { return 누적잔액; }
	
	public int 수입차액_반환() { return 수입차액; }
	public int 지출차액_반환() { return 지출차액; }
	public int 수입비율_반환() { return 수입비율; }
	public int 지출비율_반환() { return 지출비율; }
}
