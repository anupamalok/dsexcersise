package com.win.lap.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairElement {
	static List<String> sumList = new ArrayList();
	public static void main(String args[]){
		int arr[] = {4,3,5,4,7,2};
		int i= Integer.MIN_VALUE;
		System.out.println(i);
		Arrays.sort(arr);
		int sum =8;
		PairElement pe = new PairElement();
		pe.pairSum(arr, sum);
		System.out.println(sumList);
	}
	
	void pairSum(int[] arr,int sum){
		System.out.println(sum);
		for(int i=0;i<arr.length;i++){
			for(int j=i+1; j < arr.length;j++){
				if(arr[i]+arr[j] == sum){
					sumList.add(""+i +" "+j);
				}
			}
		}
	}

}
