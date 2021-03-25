import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {

		int A,B,C,D;
		System.out.println("얼마나 잘했을까요?? ==>>");	
		
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
		
		System.out.println("완료");
	}
  }

}
