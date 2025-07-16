package alertpopup;

public class Sortacess {
	
	public static void main (String [] args) {
		
		int arry [] = {	5 ,3 ,0, 7, 4, 2};
		int temp = 0;
		System.out.println("orginal array is");
		for (int i = 0; i<arry.length;i++) {
			
			System.out.println(arry[i]);
		}
		
		for (int i = 0 ; i<arry.length;i++) {
			
			for (int j = i +1 ;j<arry.length;j++) {
				
				if(arry[j]<arry[i]) {
					
					temp = arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
				}
				
			}
		}
	
		System.out.println("sorted array is");
		for (int i = 0; i<arry.length;i++) {
			
			System.out.println(arry[i]);
		
		
	}

}
}
