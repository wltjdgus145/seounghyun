import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int a,b,c;		
		int sum;
//		sum=a+b+c/3;
		a=3;
		b=2;
		c=1;
		sum=scn.nextInt();
		System.out.println("ÇÕ°è="+(a+b+c));
		System.out.println("Æò±Õ ="+(a+b+c)/3);
		
		System.out.println(a*2);
		
		if(a>b) {
			System.out.println(1);
			
			
		}else if(a<b) {
			System.out.println(0);
			
			
		}if(a==b) {
			System.out.println(1);
			
			
		}else if(a!=b) {
			System.out.println(0);
			
			
		}
		
		
		
		
		
		
	}

}
