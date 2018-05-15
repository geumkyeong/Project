package 가계부;

public class 출력 {
	public void 수지내역_출력(String 항목, String 품목, int 금액) {
		System.out.println("========== 수지내역  ==========");
		System.out.println(항목 + " > " + 품목 + " " + 금액);
	}
	public void 누적내역_출력(int 누적수입, int 누적지출, int 누적잔액) {
		System.out.println("========== 누적내역  ==========");
		System.out.println("누적수입  > " + 누적수입);
		System.out.println("누적지출  > " + 누적지출);
		System.out.println("누적잔액  > " + 누적잔액);
	}
	public void 예산차액_비율_출력(int 수입차액, int 지출차액, double 수입비율, double 지출비율) {
		System.out.println("========== 예산대비차액 ==========");
		System.out.println("수입차액  > " + 수입차액);
		System.out.println("지출차액  > " + 지출차액);
		System.out.println("========== 예산대비비율 ==========");
		System.out.println("수입비율  > " + 수입비율 + "%");
		System.out.println("지출비율  > " + 지출비율 + "%");
	}
}
