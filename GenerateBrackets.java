package backtracking;

public class GenerateBrackets {

	public void genBrac(char[] str,int pos, int size, int open, int close) {
		
		//System.out.println("starting ...");
		
		if(close == size) {
			// print 
			for(char c : str)
				System.out.print(c);
			
			System.out.println();
			
			
		}else {
			
			if(open > close) {
				str[pos] = '}';
				genBrac(str, pos+1, size, open, close+1);
			}
			
			if(open < size) {
				str[pos] = '{';
				genBrac(str, pos+1, size, open+1, close);
			}
			
			
		}
		
		
	}
	
}
