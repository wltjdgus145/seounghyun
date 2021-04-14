
public class Ex8 {

	public static void main(String[] args) {
		
		
		int a =3;
		
		while( a<=8 ) {
			int k =a;
			
			for(int i =1; i<=9; i++) {
				
				if((k==3) || (k ==5)) {
					System.out.println("<3´Ü>"+k+"*"+i+"="+i*k);
					
					
				}else {
					System.out.println(k+"*"+i+"="+i*k);
				
				}
				
				
			}
			
			
			a++;
		}
		
		System.out.println("EZ");
		
		
		
		
		
		
		
		
		
		
	}

}