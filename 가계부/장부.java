package �����;
public class ��� {
	private String �׸�, ǰ��;
	private int �ݾ�, ��������, ��������, �����ܾ�, ��������, ��������, ���Ժ���, �������;
	
	public void ���_����(String �׸�, String ǰ��, int �ݾ�) {
		this.�׸� = �׸�;
		this.ǰ�� = ǰ��;
		this.�ݾ� = �ݾ�;
	}
	public int ��������_����(int ���Աݾ�) {
		�������� += ���Աݾ�;
		return ��������;
	}
	public int ��������_����(int ����ݾ�) {
		�������� += ����ݾ�;
		return ��������;
	}
	public int �����ܾ�_����() { 
		�����ܾ� = (�������� - ��������); 
		return �����ܾ�;
	}
	public void ��������_����(int ��������, int ���Ժ���) {
		this.�������� = ��������;
		this.���Ժ��� = ���Ժ���;
	}
	public void ��������_����(int ��������, int �������) {
		this.�������� = ��������;
		this.������� = �������;
	}
	
	public String �׸�_��ȯ() { return �׸�; }
	public String ǰ��_��ȯ() { return ǰ��; }
	public int �ݾ�_��ȯ() { return �ݾ�; }
	
	public int ��������_��ȯ() { return ��������; }
	public int ���Ժ���_��ȯ() { return ���Ժ���; }
	
	public int ��������_��ȯ() { return ��������; }
	public int �������_��ȯ() { return �������; }
}