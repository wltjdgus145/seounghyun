import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		
		int a=123,b=345;
		int c=500;
		System.out.printf("%d \n",(a>b ? a:b)>c ? (a>b ? a:b):c);
		Scanner scn = new Scanner(System.in);
		if(a%b==0) {
			System.out.println(a);
			
			
			
		}if(b%2 ==0) {
			System.out.println(b);
			
			
			
		}if(c%2==0) {
			
			System.out.println(c);
			
		}
		int x,y,z;
		x=scn.nextInt();
		if(x%2==0) {
			System.out.println("x는 짝수입니다.");
			
		}else if(x%2 !=0) {
			System.out.println("x는 홀수 입니다.");
			
		
		}
		
		
		
		
		
		
		
		
		
	}

}
