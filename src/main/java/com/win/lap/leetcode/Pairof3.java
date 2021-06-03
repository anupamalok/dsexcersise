package com.win.lap.leetcode;

public class Pairof3 {

	/***
	 * 
	 * Check if the given number is n, is 3^x=n;
	 * 
	 * */
	public static void main(String args[]){
		System.out.println(check(9));
	}
	
	public static boolean check(int x){
		 /* The maximum power of 3 value that
        integer can hold is 1162261467 ( 3^19 ) .*/
			  return 1162261467 % x == 0;
		}
	
}
