package �����;
public class ��� {
	private String ����ǰ��, ����ǰ��;
	private int ���Աݾ�, ����ݾ�, ��������, ��������, �����ܾ�, ��������, ��������, ���Ժ���, �������;
	
	public void ���_����(String �׸�, String ǰ��, int �ݾ�) {
		if( �׸�.equals("����") ) { 
			����ǰ�� = ǰ��;
			���Աݾ� = �ݾ�;
		} else if( �׸�.equals("����") ) {
			����ǰ�� = ǰ��;
			����ݾ� = �ݾ�;
		}
	}
	public void �����ݾ�_����(String �׸�, int ���Աݾ�, int ����ݾ�) {
		if( �׸�.equals("����") ) { 
			�������� += ���Աݾ�;
		} else if( �׸�.equals("����") ) {
			�������� += ����ݾ�;
		}
		�����ܾ� = �������� - ��������;
	}
	public void ����_����(String �׸�, int ���Կ���, int ���⿹��) {
		if( �׸�.equals("����") ) { 
			�������� = ���Կ��� - ��������;
			���Ժ��� = (int)((double)�������� / (double)���Կ��� * 100);
		} else if( �׸�.equals("����") ) {
			�������� = ���⿹�� - ��������;
			������� = (int)((double)�������� / (double)���⿹�� * 100);
		}
	}
	
	public String ����ǰ��_��ȯ() { return ����ǰ��; }
	public int ���Աݾ�_��ȯ() { return ���Աݾ�; }
	public String ����ǰ��_��ȯ() { return ����ǰ��; }
	public int ����ݾ�_��ȯ() { return ����ݾ�; }
	
	public int ��������_��ȯ() { return ��������; }
	public int ��������_��ȯ() { return ��������; }
	public int �����ܾ�_��ȯ() { return �����ܾ�; }
	
	public int ��������_��ȯ() { return ��������; }
	public int ��������_��ȯ() { return ��������; }
	public int ���Ժ���_��ȯ() { return ���Ժ���; }
	public int �������_��ȯ() { return �������; }
}
