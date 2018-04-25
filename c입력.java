package 객체지향_중간고사;

import java.util.Scanner;

public class c입력 {
	private int 번호, 수입, 지출;
	private String 수입품목, 지출품목;
	
	Scanner sc;
	
	c입력(){
		sc = new Scanner(System.in);
	}
	
	public int 번호_입력() {
		System.out.println("1.수입 2.지출  0.끝내기"); 
		System.out.print("원하는 번호를 입력하시오 : "); 
		
		번호 = sc.nextInt();
		
		return 번호;
	}
	
	public void 품목_수입_입력() {
		System.out.print("품목과 수입을 입력하시오: "); 
		수입품목 = sc.next(); 수입 = sc.nextInt(); 
	}
	
	public void 품목_지출_입력() {
		System.out.print("품목과 지출을 입력하시오: ");
		지출품목 = sc.next();  지출 = sc.nextInt();
	}
	
	public int 번호_얻기() { return 번호; }
	public String 수입품목_얻기() { return 수입품목; }
	public String 지출품목_얻기() { return 지출품목; }
	public int 수입_얻기() { return 수입; }
	public int 지출_얻기() { return 지출; }
}
