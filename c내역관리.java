
public class c내역관리 {
	
	private String 품목;
	private int 지출, 수입;
	private int 총수입, 총지출, 잔액;
	
	public void 자료_설정 (String 품목) {
		this.품목 = 품목;
	}
	
	public void 총수입_구하기 (int 수입) {
		this.수입 += 수입;
		총수입 = this.수입;
	}
	
	public void 총지출_구하기 (int 지출) {
		this.지출 += 지출;
		총지출 = this.지출;
	}
	
	public void 총잔액_구하기 () {
		잔액 = 총수입 - 총지출;
	}
	
	public int 총수입_얻기() { return 총수입; }
	public int 총지출_얻기() { return 총지출; }
	public int 총잔액_얻기() { return 잔액; }
}
