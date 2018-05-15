package 가계부;

import java.util.Scanner;

public class 입력 {
	private String 항목, 품목;
	private int 제어자, 금액, 수입예산, 지출예산;
	
	Scanner sc;
	
	입력 () {
		sc = new Scanner(System.in);
	}
	public int 제어자_입력() {
		System.out.print("프로그램을 계속하려면 [1], 종료하려면 [0] 을 입력하시오 : ");
		제어자 = sc.nextInt();
		return 제어자;
	}
	public void 예산_입력() {
		System.out.print("예산을 입력하시오: ");
		수입예산 = sc.nextInt(); 지출예산 = sc.nextInt();
	}
	public void 장부_입력() {
		System.out.print("항목을 입력하시오 : ");
		항목 = sc.next(); 품목 = sc.next(); 금액 = sc.nextInt();
	}
	
	public int 수입예산_반환() { return 수입예산; }
	public int 지출예산_반환() { return 지출예산; }
	public String 항목_반환() { return 항목; }
	public String 품목_반환() { return 품목; }
	public int 금액_반환() { return 금액; }
}
