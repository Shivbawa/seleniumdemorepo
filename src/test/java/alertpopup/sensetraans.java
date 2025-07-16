package alertpopup;

public class sensetraans {
	
	public static void main (String [] args) {
		 String input = "this interview is for test automation";
		 input = input.toLowerCase();
		 
		
		
	 String words [] = input.split(" ");
		 for (int i = 0;i<words.length;i++) {
			 if (i%2==0) {
				 System.out.print(words[i] + " ");
			 }else {
				 
				 char [] ch = words[i].toCharArray();
				 String output = "";

				 char reverse;
				 for (int j =0 ;j <ch.length;j++) {
					 
					 
					 reverse = words[i].charAt(j);
					
					 output = reverse + output;
				 }
				 System.out.print(output + " ");
				 output="";
				 
			 }
			 
			 
		 }
		 
		 
		 }
			 
	
	//['abc','sdf','abc','sdf','yt','abc','test']
			
			
			
			
			 
}
		 
		 
		


   
	   
  
	
	


