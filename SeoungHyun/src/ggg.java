import java.util.Scanner;

public class ggg {

	public static void main(String[] args) {

		System.out.print("처리할 수를 입력하세요.>");
		Scanner scn= new Scanner(System.in);
		int a =scn.nextInt();
		
		if(a>0) {
			System.out.println("양수입니다.");
			
		}else if(a<0) {
			System.out.println("음수입니다.");
			
			
		}else {
			System.out.println("0의 값을 가집니다.");
			
		}
	System.out.println("깃허브 쉽지 않군. 쉽지");	
	}

}
