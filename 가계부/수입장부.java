package �����;

public class ������� {
	int ���Կ���, ���Աݾ�, ��������, ��������, ���Ժ���;
	
	public void ���Կ���_����(int ���Կ���) {
		this.���Կ��� = ���Կ���;
	}
	
	public int ���Աݾ�_����(String �׸�, int ���Աݾ�) {
		if( �׸�.equals("����") ) 
			this.���Աݾ� = ���Աݾ�;
		return ���Աݾ�;
	}
	public int ��������_����(int ���Աݾ�) {
		this.�������� = ���Աݾ�;
		return ��������;
	}
	public void �������׺���_����(int ��������, int ���Ժ���) {
			this.�������� = ��������;
			this.���Ժ��� = ���Ժ���;
	}
	public int ���Կ���_��ȯ() { return ���Կ���; }
	public int ��������_��ȯ() { return ��������; }
	public int ���Ժ���_��ȯ() { return ���Ժ���; }
}
