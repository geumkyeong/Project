
public class c�������� {
	
	private String ǰ��;
	private int ����, ����;
	private int �Ѽ���, ������, �ܾ�;
	
	public void �ڷ�_���� (String ǰ��) {
		this.ǰ�� = ǰ��;
	}
	
	public void �Ѽ���_���ϱ� (int ����) {
		this.���� += ����;
		�Ѽ��� = this.����;
	}
	
	public void ������_���ϱ� (int ����) {
		this.���� += ����;
		������ = this.����;
	}
	
	public void ���ܾ�_���ϱ� () {
		�ܾ� = �Ѽ��� - ������;
	}
	
	public int �Ѽ���_���() { return �Ѽ���; }
	public int ������_���() { return ������; }
	public int ���ܾ�_���() { return �ܾ�; }
}
