package �����;

public class ��� {
	private String[] ����׸�, ���ǰ��;
	private int[] ����;
	private int �Ѽ���, ������, ���ܾ�;
	
	public void ����ڷ�_����(String[] ����׸�, String[] ���ǰ��, int[] ����, int �Ѽ���, int ������, int ���ܾ�) {
		this.����׸� = ����׸�;
		this.���ǰ�� = ���ǰ��;
		this.���� = ����;
		this.�Ѽ��� = �Ѽ���;
		this.������ = ������;
		this.���ܾ� = ���ܾ�;
	}

	public void ������() {
		System.out.println("========== ��γ���  ==========");
		for(int i = 0; i < 10; i++) {
			if(���ǰ��[i] != null) {
				System.out.println( ����׸�[i] + " > " + ���ǰ��[i] + " : " + ����[i]);
			}else { break; }
		}
		System.out.println(" ");
		//�Ѱ��� ���
		System.out.println("========== ������  ==========");
		System.out.println ( "�Ѽ��� > " + �Ѽ��� );
		System.out.println ( "������ > " + ������ );
		System.out.println ( "���ܾ� > " + ���ܾ� );
	}
}
