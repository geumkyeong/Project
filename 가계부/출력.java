package °¡°èºÎ;

public class Ãâ·Â {
	private String[] °á»êÇ×¸ñ, °á»êÇ°¸ñ;
	private int[] °á»ê¾×;
	private int ÃÑ¼öÀÔ, ÃÑÁöÃâ, ÃÑÀÜ¾×;
	
	public void Ãâ·ÂÀÚ·á_¼³Á¤(String[] °á»êÇ×¸ñ, String[] °á»êÇ°¸ñ, int[] °á»ê¾×, int ÃÑ¼öÀÔ, int ÃÑÁöÃâ, int ÃÑÀÜ¾×) {
		this.°á»êÇ×¸ñ = °á»êÇ×¸ñ;
		this.°á»êÇ°¸ñ = °á»êÇ°¸ñ;
		this.°á»ê¾× = °á»ê¾×;
		this.ÃÑ¼öÀÔ = ÃÑ¼öÀÔ;
		this.ÃÑÁöÃâ = ÃÑÁöÃâ;
		this.ÃÑÀÜ¾× = ÃÑÀÜ¾×;
	}

	public void °á»êÀåºÎ() {
		System.out.println("========== ÀåºÎ³»¿ª  ==========");
		for(int i = 0; i < 10; i++) {
			if(°á»êÇ°¸ñ[i] != null) {
				System.out.println( °á»êÇ×¸ñ[i] + " > " + °á»êÇ°¸ñ[i] + " : " + °á»ê¾×[i]);
			}else { break; }
		}
		System.out.println(" ");
		//ÃÑ°á»ê¾× Ãâ·Â
		System.out.println("========== °á»êÀåºÎ  ==========");
		System.out.println ( "ÃÑ¼öÀÔ > " + ÃÑ¼öÀÔ );
		System.out.println ( "ÃÑÁöÃâ > " + ÃÑÁöÃâ );
		System.out.println ( "ÃÑÀÜ¾× > " + ÃÑÀÜ¾× );
	}
}
