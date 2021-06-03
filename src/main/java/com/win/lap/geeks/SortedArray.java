package com.win.lap.geeks;

import java.util.Arrays;

public class SortedArray {
	
	public static void main(String args[]){
		int[] a={5,8,7,7,8,10};
		sortedSqArray(a);
	}
	public static void sortedSqArray(int[] nums){
		Arrays.sort(nums);
		for(int k:nums){
		System.out.println(k);
	}}

}
