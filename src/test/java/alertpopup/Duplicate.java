package alertpopup;

public class Duplicate {
	
	public static void main (String [] args) {
		
		String s = "Shiv kumar Bawa is Bawa which is learned";
		s= s.toLowerCase();
		int count;
		
		String words[] = s.split(" ");
		
		System.out.println("Duplicate value is ");
		
		for (int i = 0;i<words.length;i++) {
			count=1;
			for (int j = i + 1;j<words.length;j++) {
				
				if(words[i].equals(words[j])) {
					
				count++;
				words[j]="0";
				
					
					
				}
				
				
			}
			
			if(count>1&&words[i]!="0") {
				
				System.out.println(words[i]);
			}
		}
		
	}

}
