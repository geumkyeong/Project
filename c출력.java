package ��ü����_�߰����;

public class c��� {
	private int �Ѽ���, ������, ���ܾ�;
	
	public void �ڷ�_����(int ����, int ����, int �ܾ�) {
		�Ѽ��� = ����; ������ = ����; ���ܾ� = �ܾ�;
	}
	
	public void ���_��� () {
		System.out.println("========== ������  ==========");
		System.out.println ( "�Ѽ���: " + �Ѽ��� );
		System.out.println ( "������: " + ������ );
		System.out.println ( "�ܾ�: " + ���ܾ� );
	}
	
	public void �������_���(String[] ����ǰ��, int[] ����) {
		System.out.println("========== �������  ==========");
		for(int i = 0 ; i < 2; i++)
			System.out.println("ǰ��: "+ ����ǰ��[i] + " �ݾ� : " + ����[i]);
	}
	
	public void �������_���(String[] ����ǰ��, int[] ����) {
		System.out.println("========== �������  ==========");
		for(int j = 0 ; j < 2; j++)
			System.out.println("ǰ��: "+ ����ǰ��[j] + " �ݾ� : " + ����[j]);
	}
}