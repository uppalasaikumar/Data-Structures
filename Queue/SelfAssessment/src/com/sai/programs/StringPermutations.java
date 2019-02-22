package com.sai.programs;

public class StringPermutations {

	public static void main(String[] args) {
	
		String s = "1234";
		permutation("",s);

	}

	private static void permutation(String perm, String word) {
		
		if(word.isEmpty()) {
			System.out.println(perm);
		}
		
		else {
			for(int i=0;i<word.length();i++) {
				permutation(perm+word.charAt(i), word.substring(0, i)+word.substring(i+1,word.length()));
			}
		}
	}

}
