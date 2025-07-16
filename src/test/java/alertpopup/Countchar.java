package alertpopup;

public class Countchar {

	
	public static void main (String [] args) {
		
		//
		
		//String arry  = "abc sdf abc sdf yt abc test";
		String words[] = {"abc","sdf","abc","sdf","yt","abc","test"};
		boolean[] visited = new boolean[words.length];
		//String we =    words.toString();
	   //  we.replaceAll(" ", "");
	     
	     
	     
	     for (int i = 0 ;i<words.length;i++) {
	    	 
	    	 if (visited[1]) continue;
	    	 int count=0;
	    	 
	    	 for (int j=0;j<words.length;j++) {
	    		 
	    		if( words[i] == words[j]) {
	    			
	    			count++;
	    			visited[j]= true;
	    			
	    	
	     }
	    		 
	    	 }
	    	 
	    	 if (count>1) {
	    		 
	    		 System.out.println(words[i] + ":" + count);
	    	 }
	     }
		
	}
}
