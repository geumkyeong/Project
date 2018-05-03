package 가계부;

import java.util.Scanner;

public class 입력 {
	private String 수입항목, 지출항목;
	private int 수입, 지출, 선택자;
	
	Scanner sc;
	
	입력 () {
		sc = new Scanner(System.in);
	}

	public int 선택자_입력() {
		System.out.print("원하는 번호를 입력하세요. 1.(수입) 2.(지출) 0.(끝내기) : ");
		선택자 = sc.nextInt();
		return 선택자;
	}
	public void 수입_입력() {
		System.out.print("수입항목을 입력하시오 : ");
		수입항목 = sc.next(); 수입 = sc.nextInt();
	}
	public void 지출_입력() {
		System.out.print("지출항목을 입력하시오 : ");
		지출항목 = sc.next(); 지출 = sc.nextInt();
	}
	
	public String 수입항목_반환() { return 수입항목; }
	public String 지출항목_반환() { return 지출항목; }
	public int 수입액_반환() { return 수입; }
	public int 지출액_반환() { return 지출; }
}
