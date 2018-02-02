package backtracking;

import java.util.List;

public class BinaryPrint {
	
	// print binary 
	void binaryPrint(int size, String choosen) {
		
		if(size == 0) {
			System.out.println(choosen);
		}else {
			
			binaryPrint(size-1, choosen+ "0");
			binaryPrint(size-1, choosen+ "1");
			
		}
		
	}
	
	// print dice 
	void dicePrint(int no, String choosen) {
		
		if(no == 0)
			System.out.println(choosen);
		else {
			for (int i=1 ; i<7 ; i++) {
				dicePrint(no-1, choosen+i);
			}
		}
		
	}
	
	// initialize array
	void initArrays(List<Integer> dim, String choosen) {
	
		if(dim.isEmpty())
			System.out.println(choosen);
		else {
			
			for (int i=0; i<dim.size(); i++) {
				
				int tmp = dim.get(i);
				dim.remove(i);
				
				for(int j=0; j<tmp; j++) {
					initArrays(dim, choosen+j);
				}
				
				//dim.add(i, tmp);
			}
			
		}

	}

}
