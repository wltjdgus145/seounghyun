import java.util.Scanner;
public class cd95 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[1000];
		
		int num = 0;
		
		for(int i = 0; i<10; i++) {
			arr[i] = scn.nextInt(); // �θ� ���� ġ��.
	
		}
		int min = arr[0]; // �켱 min �� ���� ����. for ���� ����� ���̱� ������ 0��° �ε����� ���� ������ �� ������ ���ϴ�.
		
		
		for(int a =1; a<10; a++) {
			
			if(min>arr[a]) {
				
				min = arr[a];
			}
			
		}
		System.out.println("���� ���� ��ȣ�� ==>>"+min+"�̴�.");
		
	}

}
