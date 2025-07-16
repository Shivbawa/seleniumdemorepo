package alertpopup;

public class Reversearray {
	
	public static void main(String[] args) {
	      
	      String str = "Shiv Kumar";
	      String reversestr = "";
	      char ch;
	      for (int i=0;i<str.length();i++){
	        
	        ch = str.charAt(i);
	        reversestr = ch + reversestr;
	        
	      }
	    
	      System.out.println(reversestr);

}
}
