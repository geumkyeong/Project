package 가계부;

import java.util.Arrays;

public class 장부 {
	private String[] 항목들, 수입항목들, 지출항목들, 결산;
	private int[] 수입액들, 지출액들;
	private String 항목;
	private int 수입항목수, 지출항목수, 결산항목수, 총수입, 총지출;
	
	장부() {
		항목들 = new String[2];
		수입항목들 = new String[10];
		지출항목들 = new String[10];
		결산 = new String[30];
		수입액들 = new int[10];
		지출액들 = new int[10];
	}
	
	public void 장부항목_설정(int 선택자) {
		항목들[0] = "수입";
		항목들[1] = "지출";
		항목 = 항목들[선택자-1]; // '수입' or '지출'
	}
	public void 수입장부_설정(String a, int b) {
		수입항목들[수입항목수] = a; 수입액들[수입항목수] = b;
	}
	public void 지출장부_설정(String c, int d) {
		지출항목들[지출항목수] = c; 지출액들[지출항목수] = d;
	}
	public void 결산_수입장부_관리() {
		String 수입액 = String.valueOf(수입액들[수입항목수]);
		//결산  => :'수입':'용돈':'5000':
		if (결산항목수 < 30) {
			결산[결산항목수] = 항목; 
			결산[결산항목수 +1] = 수입항목들[수입항목수];
			결산[결산항목수 +2] = 수입액; //<= 수입액들[수입항목수];
		} else { System.exit(1); }
			수입항목수++;	결산항목수 += 3; //3배수 인덱스 증가
		//for(결산항목수 = 0; 결산항목수 < 결산.length; 결산항목수 += 3)
	}
	public void 결산_지출장부_관리() {
		String 지출액 = String.valueOf(지출액들[지출항목수]);
		if(결산항목수 < 30) {
			결산[결산항목수] = 항목; 
			결산[결산항목수 +1] = 지출항목들[지출항목수];
			결산[결산항목수 +2] = 지출액;
		} else { System.exit(1); }
			지출항목수++;	결산항목수 += 3;
	}
	public int 결산_총수입() {
		for(수입항목수 = 0; 수입항목수 < 수입액들.length; 수입항목수++) {
			총수입 += 수입액들[수입항목수];
		}
		return 총수입;
	}
	public int 결산_총지출() {
		for(지출항목수 = 0; 지출항목수 < 지출액들.length; 지출항목수++) {
			총지출 += 지출액들[지출항목수];
		}
		return 총지출;
	}

	public String[] 결산_반환() { return 결산; }
}
