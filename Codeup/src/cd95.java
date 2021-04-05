import java.util.Scanner;
public class cd95 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[1000];
		
		int num = 0;
		
		for(int i = 0; i<10; i++) {
			arr[i] = scn.nextInt(); // 부른 숫자 치기.
	
		}
		int min = arr[0]; // 우선 min 에 값을 저장. for 문을 사용할 것이기 때문에 0번째 인덱스에 먼저 대입을 해 놓으면 편하다.
		
		
		for(int a =1; a<10; a++) {
			
			if(min>arr[a]) {
				
				min = arr[a];
			}
			
		}
		System.out.println("제일 작은 번호는 ==>>"+min+"이다.");
		
	}

}
