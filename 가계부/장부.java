package 가계부;
public class 장부 {
	private String 수입품목, 지출품목;
	private int 수입금액, 지출금액, 누적수입, 누적지출, 누적잔액, 수입차액, 지출차액, 수입비율, 지출비율;
	
	public void 장부_설정(String 항목, String 품목, int 금액) {
		if( 항목.equals("수입") ) { 
			수입품목 = 품목;
			수입금액 = 금액;
		} else if( 항목.equals("지출") ) {
			지출품목 = 품목;
			지출금액 = 금액;
		}
	}
	public void 누적금액_관리(String 항목, int 수입금액, int 지출금액) {
		if( 항목.equals("수입") ) { 
			누적수입 += 수입금액;
		} else if( 항목.equals("지출") ) {
			누적지출 += 지출금액;
		}
		누적잔액 = 누적수입 - 누적지출;
	}
	public void 차액_관리(String 항목, int 수입예산, int 지출예산) {
		if( 항목.equals("수입") ) { 
			수입차액 = 수입예산 - 누적수입;
			수입비율 = (int)((double)수입차액 / (double)수입예산 * 100);
		} else if( 항목.equals("지출") ) {
			지출차액 = 지출예산 - 누적지출;
			지출비율 = (int)((double)지출차액 / (double)지출예산 * 100);
		}
	}
	
	public String 수입품목_반환() { return 수입품목; }
	public int 수입금액_반환() { return 수입금액; }
	public String 지출품목_반환() { return 지출품목; }
	public int 지출금액_반환() { return 지출금액; }
	
	public int 누적수입_반환() { return 누적수입; }
	public int 누적지출_반환() { return 누적지출; }
	public int 누적잔액_반환() { return 누적잔액; }
	
	public int 수입차액_반환() { return 수입차액; }
	public int 지출차액_반환() { return 지출차액; }
	public int 수입비율_반환() { return 수입비율; }
	public int 지출비율_반환() { return 지출비율; }
}
