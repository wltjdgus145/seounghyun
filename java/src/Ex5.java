import java.util.Arrays;
public class Ex5 {

	public static void main(String[] args) {

		String[] Arr = {"가위", "바위" , "보"
		};
					
	
		 System.out.println(Arrays.toString(Arr));
		
		 for(int i =0; i<=9; i++)	{
			 int tmp = (int)(Math.random()*3); // 한 변수에 저장.		
			 System.out.println(Arr[tmp]); // 인덱스 값에 맞게 와우 와우~
			 
		 }
		 
		 
		  //0 일 때는 가위 1 일 때는 바위 2 일 때는 보 가 나오도록.
		
		
	}

}
