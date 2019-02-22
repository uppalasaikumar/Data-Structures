package com.sai.programs;


import java.util.Arrays;
import java.util.List;

public class BubbleSortList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList( new Integer[]{5,1,6,2,4,3}) ;
		System.out.println(sort(list));
		
		System.out.println(list);
		
		
		
	}

	private static List<Integer> sort(List<Integer> list) {
		
		for(int i =0 ;i<list.size();i++) {
			for(int j=0;j<list.size()-i-1;j++) {
				if(list.get(j) > list.get(j+1)) {
					Integer temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
				
			}
			System.out.println(list);
		}
		return list;
		
	}

}
