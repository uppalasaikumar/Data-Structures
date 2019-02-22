package com.sai.programs;

public class ForLoop {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		for(int i = 0;i<100;i++) {
			arr[i] = i+1;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
