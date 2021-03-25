import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {

		int A,B,C,D;
		System.out.println("¾ó¸¶³ª ÀßÇßÀ»±î¿ä?? ==>>");	
		
	Scanner scn = new Scanner(System.in);

	A =scn.nextInt();
	
	switch(A) {
		
	case 'A' :
		System.out.println("Best!!");
	
			break;
			
	case 'B' :
		System.out.println("good!");
		break;
	case 'C' : 
		System.out.println("run!");
		break;
	case 'D':
			System.out.println("slowly~");
	default:
		System.out.println("what?");
		
		System.out.println("¶ö·Î ¯˜!");
	}
  }

}
