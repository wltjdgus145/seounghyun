import java.util.Scanner;
public class forgo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.print("����� �ʴ�? >>");
		int a = scn.nextInt();
		
		System.out.println("�ð�:"+a/3600);
		
		int b = a%3600;
		
		System.out.println("��:"+b/60);
		
		int c =b%60;
		System.out.println("�ð�:"+c);
	}
}





