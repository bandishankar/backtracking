package backtracking;

import java.util.List;

public class Permutation {

	void permute(List<Character> input, String choosen) {
		
		if(input.isEmpty())
			System.out.println(choosen);
		else {
			
			for (int i=0; i<input.size(); i++) {
				
				// choose
				char ch = input.get(i);
				input.remove((Character)ch);
				
				//explore
				permute(input, choosen+ch);
				
				//un-choose
				input.add(i, (Character)ch);
				
			}
			
		}
		
	}
	
}
