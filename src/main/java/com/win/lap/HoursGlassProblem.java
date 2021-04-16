package com.win.lap;

public class HoursGlassProblem {

	public static void main(String[] args){
		 int [][] matrix = new int[][]{
			 { 1, 1, 1, 0, 0, 0},
			 {0, 1, 0, 0, 0, 0},
			 {1, 1, 1, 0, 0, 0},
			 {0, 0, 2, 4, 4, 0},
			 {0, 0, 0, 2, 0, 0},
			 {0, 0, 1, 2, 4, 0}
		 }
			;
	    System.out.println(solvehour(matrix));
	}
	
	public static int solvehour(int arr[][]){
		int row=arr.length;
		int col=arr[0].length;
		int max_sum=0;
		for(int i=0;i<row-2;i++){
			for(int j=0;j<col-2;j++){
				int sum = arr[i][j]+arr[i][j+1]+arr[i][j+1]+
						arr[i+1][j+2]+
						arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				max_sum = Math.max(max_sum,sum);
			}
		}
		return max_sum;
	}
	
}
