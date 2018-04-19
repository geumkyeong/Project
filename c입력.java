import java.util.Scanner;

public class c입력 {

	private String 품목;
	private int 지출, 수입;
	
	Scanner sc;
	
	c입력(){
		sc = new Scanner(System.in);
	}
	
	public void 수입_입력() {
		System.out.print("수입을 입력하시오: "); //문자열 출력
		품목 = sc.next(); 수입 = sc.nextInt(); sc.nextLine();
	}
	
	public void 지출_입력() {
		System.out.print("지출을 입력하시오: "); //문자열 출력
		품목 = sc.next();  지출 = sc.nextInt(); sc.nextLine();					
	}
	
	public String 품목_얻기() { return 품목; }
	public int 수입_얻기() { return 수입; }
	public int 지출_얻기() { return 지출; }
}
