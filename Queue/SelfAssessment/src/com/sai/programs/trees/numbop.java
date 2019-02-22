/* here my approach is to 1st i will split the given string and will add to the arraylist by conversting string to Integer
 * later I will find the all permutations of these list of numbers , suppose if its 5 numbrs then there will be 120 combinations 
 * I will write a function which will return all 120 possible cominations of in a list of list of Integer type, later I will loop through
 * each and every list of these combinations and will send it to other function which will do all possibel math operations on
 * between all these numbers and if the result becomes 42 then it will return true and if it is true I will print YES else I will print No
*/
package com.sai.programs.trees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class numbop {

	public static void main(String[] args) throws Exception
	{
		try (BufferedReader buffer = new BufferedReader(new FileReader("operations.txt")))
		{
			String s;
			while ((s = buffer.readLine()) != null)
			{
				String[] arr = s.trim().split(" ");
				List<Integer> numbers = new ArrayList<>();
				for (String numberText : arr)
				{
					numbers.add(Integer.valueOf(numberText));
				}
				System.out.println(numbers);
				List<List<Integer>> permutations = new ArrayList<>();
				getPermutations(permutations, numbers, new ArrayList<Integer>());
				System.out.println(permutations.size() );
				boolean canReach42 = false;
				for (List<Integer> shuffled : permutations)
				{	
					
					if(doMaths(shuffled.get(0), shuffled, 1))
					{
						System.out.println("came here");
						canReach42 = true;
						break;
					}
				}

				System.out.println(canReach42 ? "YES" : "NO");
			}
		}
	}

	private static void getPermutations(List<List<Integer>> permutations, List<Integer> remainingNumbers, List<Integer> current)
	{
		
		for (Integer number : remainingNumbers)
		{
			List<Integer> copyOfRemainingNumbers = new ArrayList<>(remainingNumbers);
			copyOfRemainingNumbers.remove(number);

			List<Integer> copyOfCurrent = new ArrayList<>(current);
			
			copyOfCurrent.add(number);
			

			if (copyOfRemainingNumbers.size() == 0)
			{
				permutations.add(copyOfCurrent);
				
			}
			else
			{
 			getPermutations(permutations, copyOfRemainingNumbers, copyOfCurrent); //120 lists in permutations
			}
		}
	}

	private static boolean doMaths(Integer current, List<Integer> numbers, int offset)
	{
		if (offset == numbers.size())
		{
			return current.equals(42);
		}

		return doMaths(current + numbers.get(offset), numbers, offset + 1) // 81 for each list in permutations
				|| doMaths(current - numbers.get(offset), numbers, offset + 1)
				|| doMaths(current * numbers.get(offset), numbers, offset + 1);
	}}