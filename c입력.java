import java.util.Scanner;

public class c�Է� {

	private String ǰ��;
	private int ����, ����;
	
	Scanner sc;
	
	c�Է�(){
		sc = new Scanner(System.in);
	}
	
	public void ����_�Է�() {
		System.out.print("������ �Է��Ͻÿ�: "); //���ڿ� ���
		ǰ�� = sc.next(); ���� = sc.nextInt(); sc.nextLine();
	}
	
	public void ����_�Է�() {
		System.out.print("������ �Է��Ͻÿ�: "); //���ڿ� ���
		ǰ�� = sc.next();  ���� = sc.nextInt(); sc.nextLine();					
	}
	
	public String ǰ��_���() { return ǰ��; }
	public int ����_���() { return ����; }
	public int ����_���() { return ����; }
}
