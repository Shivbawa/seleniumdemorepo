package alertpopup;

public class Largestno {
	
	public static void main (String [] args) {
		
		int  arrte []= {100,44,445,343};
		
		int max = arrte[0];
		
		for (int i=1;i<arrte.length;i++) {
			
			if (max<arrte[i]) {
				
				max = arrte[i];
				
			}
			
		}
		
		System.out.println("max::" + max );
	}
	

}
