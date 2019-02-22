package com.sai.programs;


import java.util.Arrays;
import java.util.List;

public class InsertionSort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList( new Integer[]{5,1,6,2,4,3}) ;
		System.out.println(sort(list));
		
	
		
		
		
	}

	private static List<Integer> sort(List<Integer> list) {
		
		for(int i = 1;i<list.size();i++) {
			int key = list.get(i);
			for(int j = i;j>0;j--) {
				if(list.get(j-1)>key) {
					Integer temp = list.get(j);
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
				}
			}
			System.out.println(list);
		}
		
		
		return list;
		
	}

}
