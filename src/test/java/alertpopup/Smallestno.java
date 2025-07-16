package alertpopup;

public class Smallestno {
	
	public static void main(String [] args) {
		
		int smallarrt [] = {100,5,45,4,34};
		int small = smallarrt[0];
		
		for (int i = 1; i<smallarrt.length;i++) {
			
			if (small>smallarrt[i]) {
				
				small = smallarrt[i];
			}
		}
		
		
	System.out.println("small is" + small);
	}

}
