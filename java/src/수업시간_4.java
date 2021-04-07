import java.util.Scanner;

public class 수업시간_4 {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);	
				
		int menu;
		
		do	{
			System.out.println("손님 주문하시겠습니까?");
		System.out.println("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 =>");
		menu =scn.nextInt();
		switch(menu) {
		
		case 1:
			System.out.println("카페라떼 주문하셨습니다.");
		break;
		case 2:
			System.out.println("카푸치노 주문하셨습니다.");
		break;
		case 3:
			System.out.println("아메리카노 주문하셨습니다.");
		break;
		case 4:
			System.out.println("잘못 주문하셨습니다.");
		break;
		
		}
		
		}while(menu !=4);
			

	
	
		
	}

}
