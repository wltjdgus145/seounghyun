import java.util.Scanner;

public class cafe {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요.");
		int a;
		a = scn.nextInt();
		switch(a) {
		
		case 1: System.out.println("아메리카노"); break;
		case 2: System.out.println("콜라");	break;
		case 3: System.out.println("블랙펄 라떼");	break;
		
		
		default:
			System.out.println("다른 메뉴를 선택하세요.");
		
		
		}
		
		
	}

}
