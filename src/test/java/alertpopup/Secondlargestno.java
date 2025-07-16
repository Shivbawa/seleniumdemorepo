package alertpopup;

public class Secondlargestno {
	public static void main (String [] args) {
		
		int[] arrt  = {23,42,67,45};
		int firstno = arrt[0] ,secondno = arrt[1];
	
		
		for (int i: arrt) {
			
			if (i > firstno) {
				secondno = firstno;
				firstno = i;
				
			
			}
			
			else if(i >  secondno){
				secondno = i;
				
			}
		}
	
		System.out.println("second largest" + secondno);
	}

}
