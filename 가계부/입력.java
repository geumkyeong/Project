package �����;

import java.util.Scanner;

public class �Է� {
	private String �����׸�, �����׸�;
	private int ����, ����, ������;
	
	Scanner sc;
	
	�Է� () {
		sc = new Scanner(System.in);
	}

	public int ������_�Է�() {
		System.out.print("���ϴ� ��ȣ�� �Է��ϼ���. 1.(����) 2.(����) 0.(������) : ");
		������ = sc.nextInt();
		return ������;
	}
	public void ����_�Է�() {
		System.out.print("�����׸��� �Է��Ͻÿ� : ");
		�����׸� = sc.next(); ���� = sc.nextInt();
	}
	public void ����_�Է�() {
		System.out.print("�����׸��� �Է��Ͻÿ� : ");
		�����׸� = sc.next(); ���� = sc.nextInt();
	}
	
	public String �����׸�_��ȯ() { return �����׸�; }
	public String �����׸�_��ȯ() { return �����׸�; }
	public int ���Ծ�_��ȯ() { return ����; }
	public int �����_��ȯ() { return ����; }
}
