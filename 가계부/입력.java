package �����;

import java.util.Scanner;

public class �Է� {
	private String �׸�, ǰ��, �����׸�, ��ȣ;
	private int ���Կ���, ���⿹��, �ݾ�, ������;
	Scanner sc;
	
	�Է� () {
		sc = new Scanner(System.in);
	}
	public int ������_�Է�() {
		//System.out.print("���� �Է� [1], ���� [2], ���α׷��� ����Ϸ���[3], �����Ϸ��� [0]�� �Է��Ͻÿ�: ");
		System.out.print("���� �Է� [1], ���α׷��� ����Ϸ���[2], �����Ϸ��� [0]�� �Է��Ͻÿ�: ");
		int ������ = sc.nextInt();
		return ������;
	}
	public int ���Կ���_�Է�() {
		System.out.print("���Կ����� �Է��Ͻÿ�: ");
		���Կ��� = sc.nextInt();
		return ���Կ���;
	}
	public int ���⿹��_�Է�() {
		System.out.print("���⿹���� �Է��Ͻÿ�: ");
		���⿹�� = sc.nextInt();
		return ���⿹��;
	}
	public void ���_�Է�() {
		System.out.print("�׸��� �Է��Ͻÿ� : ");
		�׸� = sc.next(); ǰ�� = sc.next(); �ݾ� = sc.nextInt();
	}
	public String �׸�_��ȯ() { return �׸�; }
	public String ǰ��_��ȯ() { return ǰ��; }
	public int �ݾ�_��ȯ() { return �ݾ�; }
}