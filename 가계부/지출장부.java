package �����;

public class ������� {
	int ���⿹��, ����ݾ�, ��������, ��������, �������;
	
	public void ���⿹��_����(int ���⿹��) {
		this.���⿹�� = ���⿹��;
	}
	
	public int ����ݾ�_����(String �׸�, int ����ݾ�) {
		if( �׸�.equals("����") ) 
			this.����ݾ� = ����ݾ�;
		return ����ݾ�;
	}
	public int ��������_����(int ����ݾ�) {
		this.�������� = ����ݾ�;
		return ��������;
	}
	public void �������׺���_����(int ��������, int �������) {
		this.�������� = ��������;
		this.������� = �������;
	}
	public int ���⿹��_��ȯ() { return ���⿹��; }
	public int ��������_��ȯ() { return ��������; }
	public int �������_��ȯ() { return �������; }
}
