package �����;

public class ��� {
	private String[] ���;
	private int �Ѽ���, ������, ���ܾ�;
	
	public void ����ڷ�_����(String[] ���, int �Ѽ���, int ������, int ���ܾ�) {
		this.��� = ���;
		this.�Ѽ��� = �Ѽ���;
		this.������ = ������;
		this.���ܾ� = ���ܾ�;
	}

	public void ������() {
		System.out.println("========== ��γ���  ==========");
		//������ ���
		for(int i = 0; i < ���.length; i += 3) {
			if( ���[i] != null ) 
				System.out.println( ���[i] + " > " + ���[i+1] + " : " + ���[i+2] );
			else
				break;
		}
		System.out.println(" ");
		//�Ѱ��� ���
		System.out.println("========== ������  ==========");
		System.out.println ( "�Ѽ��� > " + �Ѽ��� );
		System.out.println ( "������ > " + ������ );
		System.out.println ( "���ܾ� > " + ���ܾ� );
	}
}
