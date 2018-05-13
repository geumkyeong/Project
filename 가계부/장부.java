package 가계부;
public class 장부 {
	private String[] 항목들, 수입항목들, 지출항목들;
	private String[] 결산항목들, 결산품목들;
	private int[] 수입액들, 지출액들, 결산액들;
	private String 항목;
	private int 수입항목수, 지출항목수, 결산항목수, 총수입, 총지출;
	
	장부() {
		수입항목들 = new String[10];
		지출항목들 = new String[10];
		결산항목들 = new String[10];
		결산품목들 = new String[10];
		결산액들 = new int[10];
		수입액들 = new int[10];
		지출액들 = new int[10];
	}
	public void 수입장부_설정(String a, int b) {
		수입항목들[수입항목수] = a; 수입액들[수입항목수] = b;
	}
	public void 지출장부_설정(String c, int d) {
		지출항목들[지출항목수] = c; 지출액들[지출항목수] = d;
	}
	public void 결산장부_관리(int 선택자) {
			if(선택자 == 1) {
				결산항목들[결산항목수] = "수입"; 
				결산품목들[결산항목수] = 수입항목들[수입항목수];
				결산액들[결산항목수] = 수입액들[수입항목수];
				수입항목수++;	결산항목수++;
			} else if(선택자 == 2) {
				결산항목들[결산항목수] = "지출"; 
				결산품목들[결산항목수] = 지출항목들[지출항목수];
				결산액들[결산항목수] = 지출액들[지출항목수];
				지출항목수++;	결산항목수++;
			}
	}
	public int 결산_총수입() {
		for (수입항목수 = 0; 수입항목수 < 수입액들.length; 수입항목수++) {
			총수입 += 수입액들[수입항목수];
		}
		return 총수입;
	}
	public int 결산_총지출() {
		for (지출항목수 = 0; 지출항목수 < 지출액들.length; 지출항목수++) {
			총지출 += 지출액들[지출항목수];
		}
		return 총지출;
	}
	public String[] 결산항목장부_반환() { return 결산항목들; }
	public String[] 결산품목장부_반환() { return 결산품목들; }
	public int[] 결산액장부_반환() { return 결산액들; }
}
