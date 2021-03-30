import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int sum,num;
		num=scn.nextInt();
		sum =0;
		for(int i =0; i<=num; i++) {
			sum +=i;
			
			if(sum>=num) {
				
				System.out.println(i-1+"±îÁö");
			
				break; 
				
				
				
	 }
   }
  }
 }
