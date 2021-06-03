package com.win.lap.geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BrickWallproblem {
	
	public static void main(String args[]){
		int array[][]={{3, 5, 1, 1},
	             {2, 3, 3, 2},
	             {5, 5},
	             {4, 4, 2},
	             {1, 3, 3, 3},
	             {1, 1, 6, 1, 1}};
		 List<List<Integer>> wall = new ArrayList<>();
		    List<Integer> row1 = new ArrayList<>();
		    List<Integer> row2 = new ArrayList<>();
		    List<Integer> row3 = new ArrayList<>();
		    List<Integer> row4 = new ArrayList<>();
		    List<Integer> row5 = new ArrayList<>();
		    List<Integer> row6 = new ArrayList<>();
		    row1.add(3);
		    row1.add(5);
		    row1.add(1);
		    row1.add(1);
		    row2.add(2);
		    row2.add(3);
		    row2.add(3);
		    row2.add(2);
		    row3.add(5);
		    row3.add(5);
		    row4.add(4);
		    row4.add(4);
		    row4.add(2);
		    row5.add(1);
		    row5.add(3);
		    row5.add(3);
		    row5.add(3);
		    row6.add(1);
		    row6.add(1);
		    row6.add(6);
		    row6.add(1);
		    row6.add(1);
		    wall.add(row1);
		    wall.add(row2);
		    wall.add(row3);
		    wall.add(row4);
		    wall.add(row5);
		    wall.add(row6);
		
		System.out.println(Arrays.deepToString(array));
		System.out.println(leastNumber(array, 10));
	}
	private static int leastNumber(int[][] array , int width) {
		int[]hash=new int[width+1]; // HashSet to store the occurrences of edges
		HashMap<Integer, Integer> map=new HashMap<>();
		int max=0;
		// iterating over input array
		for(int i=0;i<array.length;i++) {
			int sum=0;
			for(int j=0;j<array[i].length;j++) {
				sum=sum+array[i][j];
				array[i][j]=sum; // replacing the actual values with the position of edges
				hash[sum]+=1; // storing the occurrences of edges.
				if(map.containsKey(array[i][j]) && j != array[i].length-1){
					map.put(array[i][j], map.get(array[i][j])+1);
				}
				else{
					if(j != array[i].length-1){
					map.put(array[i][j], 1);
					}
					}
			}
		}
		System.out.println(Arrays.deepToString(array));
		System.out.println(map);
		 int maxValueInMap=(Collections.max(map.values()));
		 return array.length - maxValueInMap;
		 /*System.out.println(maxValueInMap);
		// Loop to iterate over the input array which now contains the position of edges
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length-1;j++) { // excluding the last element in the row
				int ele=array[i][j];
				int val=hash[ele]; // retrieving the occurrence of the edge from hash array
				if(val>max)
					max=val; //finding the maximum of occurrences of all edges
			}
		}
		return array.length-max; */
	}
	
	
	public static void main1(String[] args) {
	    List<List<Integer>> wall = new ArrayList<>();
	    List<Integer> row1 = new ArrayList<>();
	    List<Integer> row2 = new ArrayList<>();
	    List<Integer> row3 = new ArrayList<>();
	    List<Integer> row4 = new ArrayList<>();
	    List<Integer> row5 = new ArrayList<>();
	    List<Integer> row6 = new ArrayList<>();
	    row1.add(1);
	    row1.add(2);
	    row1.add(2);
	    row1.add(1);
	    row2.add(3);
	    row2.add(1);
	    row2.add(2);
	    row3.add(1);
	    row3.add(3);
	    row3.add(2);
	    row4.add(2);
	    row4.add(4);
	    row5.add(3);
	    row5.add(1);
	    row5.add(2);
	    row6.add(1);
	    row6.add(3);
	    row6.add(1);
	    row6.add(1);
	    wall.add(row1);
	    wall.add(row2);
	    wall.add(row3);
	    wall.add(row4);
	    wall.add(row5);
	    wall.add(row6);
	    System.out.println(wall);
	    System.out.println(leastBricks(wall));
	  }

	  public static int leastBricks(List<List<Integer>> wall) {
		  HashMap<Integer, Integer> map=new HashMap<>();
	    for (List<Integer> row : wall) {
	      int prefix = 0;
	      for (int i = 0, l = row.size(); i < l; i++) {
	        prefix += row.get(i);
	        row.set(i, prefix);
	        if(map.containsKey(prefix) && i != row.size()-1){
				map.put(prefix, map.get(prefix)+1);
			}
			else{
				if(i != row.size()-1){
				map.put(prefix, 1);
				}
				}
	      }
	    }
	    int result = Integer.MIN_VALUE;
	    System.out.println(Collections.max(map.values()));
	    for (List<Integer> row : wall) {
	      for (int i = 0, l = row.size(); i < l - 1; i++) {
	        int prefix = row.get(i);
	        if (map.containsKey(prefix)) {
	          int plusOne = map.get(prefix) + 1;
	          map.put(prefix, plusOne);
	          result = Math.max(result, plusOne);
	        } else {
	          map.put(prefix, 1);
	          result = Math.max(result, 1);
	        }
	      }
	    }
	    return (result == Integer.MIN_VALUE) ? wall.size() : wall.size() - result;
	  }
	}
