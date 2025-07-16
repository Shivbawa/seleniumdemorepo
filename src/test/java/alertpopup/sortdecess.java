package alertpopup;

public class sortdecess {
	
	public static void main (String [] args) {
		int arrty [] = {5,4,3,7,8,2};
		int temp = 0;
		
		System.out.println("original");
		
		for (int i = 0;i<arrty.length;i++) {
			
			System.out.print(arrty[i]);
		}
	
		for (int i = 0; i<arrty.length;i++) {
			
			for (int j = i+1; j<arrty.length;j++) {
				
				if (arrty[j]>arrty[i]) {
					
					temp = arrty[i];
					arrty[i]=arrty[j];
					arrty[j]=temp;
				}
				
				
			}
			
			
		}
		

		System.out.println("Sorted");
		
		for (int i = 0;i<arrty.length;i++) {
			
			System.out.print(arrty[i]);
	}
	

}
}
