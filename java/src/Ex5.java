import java.util.Arrays;
public class Ex5 {

	public static void main(String[] args) {

		String[] Arr = {"����", "����" , "��"
		};
					
	
		 System.out.println(Arrays.toString(Arr));
		
		 for(int i =0; i<=9; i++)	{
			 int tmp = (int)(Math.random()*3); // �� ������ ����.		
			 System.out.println(Arr[tmp]); // �ε��� ���� �°� �Ϳ� �Ϳ�~
			 
		 }
		 
		 
		  //0 �� ���� ���� 1 �� ���� ���� 2 �� ���� �� �� ��������.
		
		
	}

}
