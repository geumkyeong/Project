package 객체지향_중간고사;

public class c출력 {
	private int 총수입, 총지출, 총잔액;
	
	public void 자료_설정(int 수입, int 지출, int 잔액) {
		총수입 = 수입; 총지출 = 지출; 총잔액 = 잔액;
	}
	
	public void 결산_출력 () {
		System.out.println("========== 결산장부  ==========");
		System.out.println ( "총수입: " + 총수입 );
		System.out.println ( "총지출: " + 총지출 );
		System.out.println ( "잔액: " + 총잔액 );
	}
	
	public void 수입장부_출력(String[] 수입품목, int[] 수입) {
		System.out.println("========== 수입장부  ==========");
		for(int i = 0 ; i < 2; i++)
			System.out.println("품목: "+ 수입품목[i] + " 금액 : " + 수입[i]);
	}
	
	public void 지출장부_출력(String[] 지출품목, int[] 지출) {
		System.out.println("========== 지출장부  ==========");
		for(int j = 0 ; j < 2; j++)
			System.out.println("품목: "+ 지출품목[j] + " 금액 : " + 지출[j]);
	}
}