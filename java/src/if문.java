import java.util.Scanner;
public class if�� {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("����� ������?");
		int a =scn.nextInt();
		
		if(a>90) {
			
			System.out.println("A�Դϴ�.");
			
		}else if(a>50) {
			
			System.out.println("B�Դϴ�.");
			
		}else {
			
			System.out.println("C�Դϴ�.");
		}
		
	}

}
