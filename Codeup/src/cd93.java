import java.util.Scanner;
public class cd93 {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int[] arr = new int[23];
		 int n=scn.nextInt();
		 
		 for(int i =0; i<n; i++) {
			 int num = scn.nextInt();
			 arr[num-1] +=1;   // arr ���� index ��ȣ ������ ��, �Ҹ� ���ڰ� ����ȴ�. 
			 
			 
		 }
		 
		 for(int i =0; i<23; i++) {
			 
			 System.out.print(arr[i]+" ");
			 
		 }
		 
		 
		 System.out.println("�ƴ� ��¥ ���̷�");

		 
	}
	//�迭�� ������ �� �Ŀ� �����ؾ���!!!
}
