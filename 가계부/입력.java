package 가계부;

import java.util.Scanner;

public class 입력 {
	private String 항목, 품목, 예산항목, 부호;
	private int 수입예산, 지출예산, 금액, 증감액;
	Scanner sc;
	
	입력 () {
		sc = new Scanner(System.in);
	}
	public int 제어자_입력() {
		//System.out.print("예산 입력 [1], 수정 [2], 프로그램을 계속하려면[3], 종료하려면 [0]을 입력하시오: ");
		System.out.print("예산 입력 [1], 프로그램을 계속하려면[2], 종료하려면 [0]을 입력하시오: ");
		int 제어자 = sc.nextInt();
		return 제어자;
	}
	public int 수입예산_입력() {
		System.out.print("수입예산을 입력하시오: ");
		수입예산 = sc.nextInt();
		return 수입예산;
	}
	public int 지출예산_입력() {
		System.out.print("지출예산을 입력하시오: ");
		지출예산 = sc.nextInt();
		return 지출예산;
	}
	public void 예산증감_입력() {
		System.out.print("예산항목를 입력하시오 :");
		예산항목 = sc.next(); 
		System.out.print("예산정도를 입력하시오 (부호와 증감액 입력):");
		부호 = sc.next(); 증감액 = sc.nextInt();
	}
	public void 장부_입력() {
		System.out.print("항목을 입력하시오 : ");
		항목 = sc.next(); 품목 = sc.next(); 금액 = sc.nextInt();
	}
	public String 예산항목_반환() { return 예산항목; }
	public String 부호_반환() { return 부호; }
	public int 증감액_반환(	) { return 증감액; }
	public String 항목_반환() { return 항목; }
	public String 품목_반환() { return 품목; }
	public int 금액_반환() { return 금액; }
}
	
