package 가계부;

public class 출력 {
	public void 장부내역_출력(String 항목, String 품목, int 금액, int 누적잔액, int 수입차액, int 수입비율, int 지출차액, int 지출비율) {
		System.out.println(" |    내역	|  잔액	| 수입차액    | 지출차액  |");
		System.out.println(" | " + 항목 + " > " + 품목 + " : " + 금액 + " | " + 누적잔액 +
		" | " + 수입차액 + " | "+ 수입비율 + "% |"  + 지출차액 + " " + 지출비율 +"% |");
	}
}