package com.queue.implementation;

public class stringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isRotation("abcd","cdab");
	}

	private static void isRotation(String s1, String s2) {
		
		for(int i = s1.length()-1;i>=0;i--) {
			s1 = s1.substring(s1.length()-1, s1.length())+s1.substring(0,s1.length()-1);
			System.out.println(s1);
			if(s1.equals(s2))
				System.out.println("rotation");
		}
	}

}
