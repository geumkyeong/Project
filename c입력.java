package ��ü����_�߰����;

import java.util.Scanner;

public class c�Է� {
	private int ��ȣ, ����, ����;
	private String ����ǰ��, ����ǰ��;
	
	Scanner sc;
	
	c�Է�(){
		sc = new Scanner(System.in);
	}
	
	public int ��ȣ_�Է�() {
		System.out.println("1.���� 2.����  0.������"); 
		System.out.print("���ϴ� ��ȣ�� �Է��Ͻÿ� : "); 
		
		��ȣ = sc.nextInt();
		
		return ��ȣ;
	}
	
	public void ǰ��_����_�Է�() {
		System.out.print("ǰ��� ������ �Է��Ͻÿ�: "); 
		����ǰ�� = sc.next(); ���� = sc.nextInt(); 
	}
	
	public void ǰ��_����_�Է�() {
		System.out.print("ǰ��� ������ �Է��Ͻÿ�: ");
		����ǰ�� = sc.next();  ���� = sc.nextInt();
	}
	
	public int ��ȣ_���() { return ��ȣ; }
	public String ����ǰ��_���() { return ����ǰ��; }
	public String ����ǰ��_���() { return ����ǰ��; }
	public int ����_���() { return ����; }
	public int ����_���() { return ����; }
}
