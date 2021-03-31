import java.util.Scanner;
public class cd91 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int res =0;
		System.out.println("숫자를 입력하여 그 번째의 값을 구하세요.>");
		int n =scn.nextInt();
		for(int i = 0; i<=n; i++) {
			
			res =  res *-2 +4;
			
			
			
			
		}
		System.out.println(n+"번째 값은"+res+"입니다.");
		System.out.println(res);
			
		
	}

}
