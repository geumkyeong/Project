package 가계부;

public class 출력 {
	public void 장부내역_출력(String[] 항목들, String[] 품목들, int[] 금액들, int[] 누적잔액들, int[] 수입차액들, int[] 지출차액들, int[] 수입비율들, int[] 지출비율들) {
		System.out.println("내역		금액	수입차액	지출차액");
		for( int i = 0; i < 항목들.length; i ++ ) {
			if(항목들[i] != null) {
				System.out.println(항목들[i] + " > " + 품목들[i] + " : " + 금액들[i] + " " + 누적잔액들[i] +
						" " + 수입차액들[i] + " " + 수입비율들[i] + "% " + 지출차액들[i] + " " + 지출비율들[i] +"% ");
			}
		}
	}
}
