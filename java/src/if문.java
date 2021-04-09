import java.util.Scanner;
public class if문 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("당신의 학점은?");
		int a =scn.nextInt();
		
		if(a>90) {
			
			System.out.println("A입니다.");
			
		}else if(a>50) {
			
			System.out.println("B입니다.");
			
		}else {
			
			System.out.println("C입니다.");
		}
		
	}

}
