package backtracking;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryPrint bp = new BinaryPrint();
		
		Combination cmb = new Combination();
		//bp.binaryPrint(5, "");
		
		//bp.dicePrint(3, "");
		
		
		Permutation perm = new Permutation();
		
		List<Character> ch = new ArrayList<Character>();
		ch.add('M');
		ch.add('A');
		ch.add('R');
		//ch.add('T');
		//ch.add('Y');
		//perm.permute(ch, "");
		
		List<Integer> dim = new ArrayList<Integer>();
		dim.add(2);
		dim.add(2);
		//dim.add(5);
		//dim.add(2);
		//bp.initArrays(dim, "");
		
		List<String> input = new ArrayList<String>();
		input.add("1");
		input.add("2");
		input.add("3");
		//input.add("d");
		
		//cmb.generateStringCombination(input, new ArrayList<String>());
		
		
		
		RatMaze rat = new RatMaze();
		int maze[][] = { { 1, 0, 1, 1,1 }, { 1, 1, 1, 0,1 }, { 0, 0,0, 1, 1 },
				{ 0, 0, 0, 1,0 },{ 0, 0,0, 1, 1 } };
		//rat.solveMaze(maze);
		
		
		GenerateBrackets gb = new GenerateBrackets();
		char[] str = new char[6];
		gb.genBrac(str, 0, 3, 0, 0);
		
		
		
		
	}

}
