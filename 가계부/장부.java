package 가계부;
public class 장부 {
	String 항목, 품목;
	int 금액, 누적잔액;
	
	public void 장부_설정(String 항목, String 품목, int 금액) {
		this.항목 = 항목;
		this.품목 = 품목;
		this.금액 = 금액;
	}
	public void 누적잔액_설정(int 누적잔액) { this.누적잔액 = 누적잔액; }
	
	public String 항목_반환() { return 항목; }
	public String 품목_반환() { return 품목; }
	public int 금액_반환() { return 금액; }
}