package permutations;

import java.util.ArrayList;

public class PermutationGenerator
{
	public static void main(String[] args)
	{
		System.out.println(getPermutations("eat"));
	}
	
	public static ArrayList<String> getPermutations(String toPermute)
	{
		ArrayList<String> permutations = new ArrayList<String>();
		
		// strings of length 0 have only 1 permutation
		if(toPermute.length() == 0)
		{
			permutations.add("");
			return permutations;
		}
		
		// remove each character individually and find all permutations of each shorter string
		for(int i = 0; i < toPermute.length(); i++)
		{
			// remove 1 character to form a shorter word
			String shorterWord = toPermute.substring(0,i) + toPermute.substring(i+1);
			
			// find all permutations of shorter word
			ArrayList<String> shorterPermutations = getPermutations(shorterWord);
			
			// construct permutations of original word from permutations of shorter word
			for(String shorterPermutation : shorterPermutations)
				permutations.add(toPermute.substring(i,i+1) + shorterPermutation);
		}
		
		return permutations;
	}
}