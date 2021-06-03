package com.win.lap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayEqual {
	
	public static void main(String[] args){
		Integer a[] = { 1234, 4321 };
		Integer b[] = { 2345,3214 };
	    List<Integer> bb= new ArrayList<Integer>();
	    List<Integer> aa= new ArrayList<Integer>();
	    Collections.addAll(bb,b);
	    Collections.addAll(aa, a);
	    int[] k ={ 1234, 4321 };
	    int[] j ={2345,3214};
	   System.out.println(minimumMoves(aa, bb));
	   System.out.println(countMoveToEqualArrayElements(k,j));
	}
	
	private static int countMoveToEqualArrayElements(int[] a, int[] b) {
		int aLength = a.length;
		int counter = 0;

		if (a.length != b.length) {
			throw new RuntimeException("Make sure both arrays have equal elements");
		}

		for (int i = 0; i < aLength; i++) {
			String as = String.valueOf(a[i]);
			String bs = String.valueOf(b[i]);
			for (int c = 0; c < as.length(); c++) {
				int aValue = Integer.parseInt(Character.toString(as.charAt(c)));
				int bValue = Integer.parseInt(Character.toString(bs.charAt(c)));
				if (aValue > bValue) {
					counter += aValue - bValue;
				} else {
					counter += bValue - aValue;
				}
			}
		}

		return counter;
	}

	
	
	 public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
		    // Write your code here
		    int[] ar1 = new int[arr1.size()];
		    int[] ar2 = new int[arr2.size()];
		    
		    for(int i=0;i<arr1.size();i++){
		        ar1[i] = arr1.get(i); 
		        ar2[i] = arr2.get(i);
		    }
		    Arrays.sort(ar1);
		    Arrays.sort(ar2);
	
		    int result =0;
		    for(int i=0; i<ar1.length;i++){
		        if(ar1[i]>ar2[i]){
		            result = result + Math.abs(ar1[i]-ar2[i]);
		        }else if(ar1[i]<ar2[i]){
		            result = result + Math.abs(ar1[i] - ar2[i]);
		        }
		    }
		    return result;

		    }

}
