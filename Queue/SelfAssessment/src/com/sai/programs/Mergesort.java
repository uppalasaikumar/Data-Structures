package com.sai.programs;

import java.util.Arrays;
import java.util.List;

public class Mergesort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] { 5, 1, 6, 2, 4, 3 });
		System.out.println(sort(list));

	}

	private static List<Integer> sort(List<Integer> list) {

		mergesort(list, 0, list.size() - 1);
		return list;

	}

	private static void mergesort(List<Integer> list, int l, int r) {

		if (l < r) {
			int mid = (l + r) / 2;

			mergesort(list, l, mid);
			mergesort(list, mid+1, r);
			merge(list, l, mid, r);

		}
	}

	private static void merge(List<Integer> list, int l, int mid, int r) {

		int n1 = mid - l+1;
		int n2 = r-mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0;i<n1;i++) {
			L[i] = list.get(l+i);
		}
		
		for(int j = 0;j<n2;j++) {
			R[j] = list.get(mid+j+1);
		}
		
		
		int i=0,j =0;
		int k =l;
		
		while(i<n1&&j<n2) {
			if(L[i] <= R[j]) {
				list.set(k, L[i]);
				k++;
				i++;
			}
			else {
				list.set(k, R[j]);
				k++;
				j++;
			}
		}
		
		if(i<n1) {
		 list.set(k, L[i]);
		 i++;
		 k++;
		}
		if(j<n2) {
			list.set(k, R[j]);
			j++;
			k++;
		}
		
		
	}

}



























