package 가계부;

public class 출력 {
	private String[] 결산;
	private int 총수입, 총지출, 총잔액;
	
	public void 출력자료_설정(String[] 결산, int 총수입, int 총지출, int 총잔액) {
		this.결산 = 결산;
		this.총수입 = 총수입;
		this.총지출 = 총지출;
		this.총잔액 = 총잔액;
	}

	public void 결산장부() {
		System.out.println("========== 장부내역  ==========");
		//결산장부 출력
		for(int i = 0; i < 결산.length; i += 3) {
			if( 결산[i] != null ) 
				System.out.println( 결산[i] + " > " + 결산[i+1] + " : " + 결산[i+2] );
			else
				break;
		}
		System.out.println(" ");
		//총결산액 출력
		System.out.println("========== 결산장부  ==========");
		System.out.println ( "총수입 > " + 총수입 );
		System.out.println ( "총지출 > " + 총지출 );
		System.out.println ( "총잔액 > " + 총잔액 );
	}
}
