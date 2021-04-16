package com.win.lap.leetcode;

public class InversionGlobalLocal {

	/*
	 * You are given an integer array nums of length n which represents a
	 * permutation of all the integers in the range [0, n - 1].
	 * 
	 * The number of global inversions is the number of the different pairs (i,j) where:
	 * 
	 * 0 <= i < j < n nums[i] > nums[j] The number of local inversions is the
	 * number of indices i where:
	 * 
	 * 0 <= i < n - 1 nums[i] > nums[i + 1] Return true if the number of global
	 * inversions is equal to the number of local inversions.
	 * 
	 */

	public static void main(String args[]) {
		int[] a = { 1, 0, 2 };
		System.out.println(isIdealPermutation(a));
	}

	public static boolean isIdealPermutation(int[] A) {
		int val = -1;
		int s = A.length;
		for (int i = 0; i < s - 2; i++) {
			val = Math.max(A[i], val);
			if (val > A[i + 2])
				return false;
		}
		return true;

	}
}
