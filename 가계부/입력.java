package �����;

import java.util.Scanner;

public class �Է� {
	private String �׸�, ǰ��;
	private int ������, �ݾ�, ���Կ���, ���⿹��;
	
	Scanner sc;
	
	�Է� () {
		sc = new Scanner(System.in);
	}
	public int ������_�Է�() {
		System.out.print("������ �����Ϸ��� [1], ���α׷��� ����Ϸ���[2], �����Ϸ��� [0] �� �Է��Ͻÿ� : ");
		������ = sc.nextInt();
		return ������;
	}
	public void ����_�Է�() {
		System.out.print("������ �Է��Ͻÿ�: ");
		���Կ��� = sc.nextInt(); ���⿹�� = sc.nextInt();
	}
	public void ���_�Է�() {
		System.out.print("�׸��� �Է��Ͻÿ� : ");
		�׸� = sc.next(); ǰ�� = sc.next(); �ݾ� = sc.nextInt();
	}
	
	public int ���Կ���_��ȯ() { return ���Կ���; }
	public int ���⿹��_��ȯ() { return ���⿹��; }
	public String �׸�_��ȯ() { return �׸�; }
	public String ǰ��_��ȯ() { return ǰ��; }
	public int �ݾ�_��ȯ() { return �ݾ�; }
}
