package alertpopup;
public class Duplicatearray {
	
	public static void main (String [] args) {
		
		//
		
		//String arry  = "abc sdf abc sdf yt abc test";
		String words[] = {"abc","sdf","abc","sdf","yt","abc","test"};
		int count;
		
		for (int i = 0; i<words.length;i++) {
			
			count = 1;
			
			for (int j = i+1;j<words.length;j++) {
				
				if (words[i].equals(words[j])) {
					
					count++;
					words[j]="0";
				}
				
				
				
			}
			
				if(count>1&&words[i]!="0")	{
					
					System.out.println(words[i]);
				}
			
		}
		
		
	}
	
	
}