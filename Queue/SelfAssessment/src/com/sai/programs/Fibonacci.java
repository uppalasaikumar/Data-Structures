package com.sai.programs;

public class Fibonacci {

	public static void main(String[] args) {
		
		fibo(5);
		
		

	}

	public static void fibo(int val) {
		int prev1 = 0;
		int prev2 =1;
		int sum;
		if(val>0) {
			System.out.println(0);
		}
		if (val> 1) {
			System.out.println(1);
		}
		else {return;}
		 for(int i = 0 ;i<val-2;i++) {
			 sum = prev1+prev2;
			 System.out.println(sum);
			 prev1=prev2;
			 prev2 = sum;
		 }
	}



}
