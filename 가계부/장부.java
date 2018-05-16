package 가계부;
public class 장부 {
	private String[] 항목들, 품목들;
	private int[] 금액들, 누적잔액들, 수입차액들, 지출차액들, 수입비율들, 지출비율들;
	private String 수입품목, 지출품목;
	private int 항목수, 수입금액, 지출금액, 누적수입, 누적지출, 누적잔액, 수입차액, 지출차액, 수입비율, 지출비율;
	
	장부() {
		항목들 = new String[10];
		품목들 = new String[10];
		금액들 = new int[10];
		누적잔액들 = new int[10];
		수입차액들 = new int[10];
		지출차액들 = new int[10];
		수입비율들 = new int[10];
		지출비율들 = new int[10];
	}
	public void 장부내역_설정(String 항목, String 품목, int 금액, int 누적잔액, int 수입차액, int 지출차액, int 수입비율, int 지출비율) {
		if ( 항목수 < 항목들.length ) {
			항목들[항목수] = 항목; 
			품목들[항목수] = 품목;
			금액들[항목수] = 금액;
			누적잔액들[항목수] = 누적잔액;
			수입차액들[항목수] = 수입차액;
			지출차액들[항목수] = 지출차액;
			수입비율들[항목수] = 수입비율;
			지출비율들[항목수] = 지출비율;
		} //항목수가 배열길이를 넘지 않는 한에서 삽입
			항목수++;
	}
	public void 수입_지출금액_설정(String 항목, int 금액) {
		if( 항목.equals("수입") ) { 
			수입금액 = 금액;
		} else if( 항목.equals("지출") ) {
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
	public void 차액_관리(int 수입예산, int 누적수입, int 지출예산, int 누적지출) {
			수입차액 = 수입예산 - 누적수입;
			수입비율 = (int)((double)수입차액 / (double)수입예산 * 100);
			지출차액 = 지출예산 - 누적지출;
			지출비율 = (int)((double)지출차액 / (double)지출예산 * 100);
	}
	
	public String[] 항목들_반환() { return 항목들; }
	public String[] 품목들_반환() { return 품목들; }
	public int[] 금액들_반환() { return 금액들; }
	
	public int[] 누적잔액들_반환() { return 누적잔액들; }
	public int[] 수입차액들_반환() { return 수입차액들; }
	public int[] 지출차액들_반환() { return 지출차액들; }
	public int[] 수입비율들_반환() { return 수입비율들; }
	public int[] 지출비율들_반환() { return 지출비율들; }
	
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
