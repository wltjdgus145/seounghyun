import java.util.Arrays;

public class ch06 {

	public static void main(String[] args) {
		int sum =0;
		int[][] score =  new int[][]
				{
				
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
				
						};
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				System.out.printf("sum[%d][%d] =%d\n",  i, j, score[i][j]);
				
				sum += score[i][j];  
				
			}
			
			
		}
		System.out.println("sum ="+ sum);
		System.out.println(Arrays.deepToString(score));
	}

}
