import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
			
		//3 or 6 or 9 가 출력되면 박수를 쳐야한다.
		Scanner scn = new Scanner(System.in);
		
//		int n=0;
		
		for(int i =0; i<=100; i++) {
			
			
			
			if(i %3==0 ) {
				System.out.println("박수");
				

				
				
			}else {	
				System.out.println(i);
			}
			
			
			
		}
		
	
		System.out.println("complete");	
	}

}
