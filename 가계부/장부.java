package 가계부;
public class 장부 {
	private String 항목, 품목;
	private int 금액, 누적수입, 누적지출, 누적잔액, 수입차액, 지출차액, 수입비율, 지출비율;
	
	public void 장부_설정(String 항목, String 품목, int 금액) {
		this.항목 = 항목;
		this.품목 = 품목;
		this.금액 = 금액;
	}
	public int 누적수입_관리(int 수입금액) {
		누적수입 += 수입금액;
		return 누적수입;
	}
	public int 누적지출_관리(int 지출금액) {
		누적지출 += 지출금액;
		return 누적지출;
	}
	public int 누적잔액_관리() { 
		누적잔액 = (누적수입 - 누적지출); 
		return 누적잔액;
	}
	public void 수입차율_설정(int 수입차액, int 수입비율) {
		this.수입차액 = 수입차액;
		this.수입비율 = 수입비율;
	}
	public void 지출차율_설정(int 지출차액, int 지출비율) {
		this.지출차액 = 지출차액;
		this.지출비율 = 지출비율;
	}
	
	public String 항목_반환() { return 항목; }
	public String 품목_반환() { return 품목; }
	public int 금액_반환() { return 금액; }
	
	public int 수입차액_반환() { return 수입차액; }
	public int 수입비율_반환() { return 수입비율; }
	
	public int 지출차액_반환() { return 지출차액; }
	public int 지출비율_반환() { return 지출비율; }
}