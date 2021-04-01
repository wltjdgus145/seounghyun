import java.util.Scanner;
public class cd93 {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int[] arr = new int[23];
		 int n=scn.nextInt();
		 
		 for(int i =0; i<n; i++) {
			 int num = scn.nextInt();
			 arr[num-1] +=1;   // arr 안의 index 번호 에서의 즉, 불린 숫자가 저장된다. 
			 
			 
		 }
		 
		 for(int i =0; i<23; i++) {
			 
			 System.out.print(arr[i]+" ");
			 
		 }
		 
		 
		 System.out.println("아니 진짜 왜이래");

		 
	}
	//배열을 공부해 온 후에 수정해야함!!!
}
