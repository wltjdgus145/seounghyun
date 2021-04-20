import java.util.Scanner;
public class forgo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.print("계산할 초는? >>");
		int a = scn.nextInt();
		
		System.out.println("시간:"+a/3600);
		
		int b = a%3600;
		
		System.out.println("분:"+b/60);
		
		int c =b%60;
		System.out.println("시간:"+c);
	}
}





