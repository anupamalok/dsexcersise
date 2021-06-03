package com.win.lap.leetcode;

public class CombinationSum4 {
	/*
	 * Given an array of distinct integers nums and a target integer target,
	 *  return the number of possible combinations that add up to target.
	 *  Input: nums = [1,2,3], target = 4
	 *	Output: 7
	 *  Explanation:
	 *	The possible combination ways are:
	 *	(1, 1, 1, 1)
	 *	(1, 1, 2)
	 *	(1, 2, 1)
	 *	(1, 3)
	 *	(2, 1, 1)
	 *	(2, 2)
	 *	(3, 1)
	 * */
	
	public static void main(String args[]){
		int[] num={1,2,3};
		System.out.println(combinationSum4(num,4));
	}
	
	public static int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] result = new int[target + 1];
        result[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    result[i] += result[i - num];
                }
            }
        }
        return result[target];
    
    }

}
