import java.util.Scanner;
import java.util.Arrays;
public class 수업시간_6 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int hap =0;
		int aa[] = new int[4];
		
		for(int i =0; i<aa.length; i++) {
			aa[i] = scn.nextInt();
			hap +=aa[i];
		}
		System.out.println(Arrays.toString(aa));
	
		System.out.println("ㅂ교교");
		System.out.println("hap="+ hap);
	}
	
	

}
