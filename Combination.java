package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {

	void generateStringCombination(List<String> input, List<String> choosen) {
		
		if(input.isEmpty())
			System.out.println(choosen.toString());
		else {
			
			// choose
			String tmp = input.get(0);
			choosen.add(tmp);
			
			//explore with choosen
			input.remove(tmp);
			generateStringCombination(input, choosen);
			
			// explore with un-choosen
			choosen.remove(tmp);
			generateStringCombination(input, choosen);
			
			// unchoose back
			input.add(0, tmp);
			
		}
	}
	
}
