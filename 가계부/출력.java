package �����;

public class ��� {
	public void ��γ���_���(String[] �׸��, String[] ǰ���, int[] �ݾ׵�, int[] �����ܾ׵�, int[] �������׵�, int[] �������׵�, int[] ���Ժ�����, int[] ���������) {
		System.out.println("����		�ݾ�	��������	��������");
		for( int i = 0; i < �׸��.length; i ++ ) {
			if(�׸��[i] != null) {
				System.out.println(�׸��[i] + " > " + ǰ���[i] + " : " + �ݾ׵�[i] + " " + �����ܾ׵�[i] +
						" " + �������׵�[i] + " " + ���Ժ�����[i] + "% " + �������׵�[i] + " " + ���������[i] +"% ");
			}
		}
	}
}
