import java.util.Scanner;

public class cafe {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		System.out.println("�޴��� �����ϼ���.");
		int a;
		a = scn.nextInt();
		switch(a) {
		
		case 1: System.out.println("�Ƹ޸�ī��"); break;
		case 2: System.out.println("�ݶ�");	break;
		case 3: System.out.println("���� ��");	break;
		
		
		default:
			System.out.println("�ٸ� �޴��� �����ϼ���.");
		
		
		}
		
		
	}

}
