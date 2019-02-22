package com.sai.programs;


import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList( new Integer[]{10, 80, 30, 90, 40, 50, 70}) ;
		System.out.println(quicksort(list,0,list.size()-1));

	}

	private static List<Integer> quicksort(List<Integer> list, int low, int high) {
		if(low<high) {
			
			int p = partition(list,low,high);
			quicksort(list, low, p-1);
			quicksort(list, p+1, high);
		}
		
		
		return list;
		
	}

	private static int partition(List<Integer> list, int low, int high) {
		
		int pivot = list.get(high) ;
		
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(list.get(j)<=pivot) {
				i++;
				System.out.println(list.get(j));
				Integer temp = list.get(j);
				list.set(j, list.get(i));
				list.set(i, temp);
				
			}
		}
		i++;
		System.out.println(list);
		
		System.out.println(i);
		Integer temp = list.get(i);
		list.set(i, list.get(high));
		list.set(high, temp);
		
		System.out.println(list);
		
		
		return i;
	}

}























