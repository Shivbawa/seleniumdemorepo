package alertpopup;

public class Fibnncoseries {
	
	public static void main (String [] args) {
		
		int n = 20 , firstnumber = 0 , secondnumber = 1;
		int nextnumber;
		for(int i=1;  i<=n;   i++) {
			
			System.out.print(firstnumber + ",");
			nextnumber = firstnumber + secondnumber;
			firstnumber = secondnumber;
			secondnumber = nextnumber;
		
			
		}
		
		
	}

}
