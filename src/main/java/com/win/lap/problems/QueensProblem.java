package com.win.lap.problems;

import java.util.ArrayList;
import java.util.List;

public class QueensProblem {

	public static void main(String args[]) {
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(8);
		l2.add(9);
		ll.add(l2);
		printAntiDiag(ll);

	}

	int cb[][] = new int[4][4];

	public boolean underattack(int r, int c) {

		return true;
	}

	public void operations() {
		for (int r = 0; r < cb.length; r++) {
			for (int c = 0; c < cb.length; c++) {
				cb[r][c] = 100;
				underattack(r, c);
			}
		}
	}

	public static void printAntiDiag(List<List<Integer>> matrix) {
		int[][] array = new int[matrix.size()][];
		for (int i = 0; i < matrix.size(); i++) {
			array[i] = new int[matrix.get(i).size()];
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = matrix.get(i).get(j);
			}
		}
		
		 for (int i = 0; i < 3; ++i)  
		    { 
		        for (int j = 0; j < 3; ++j) 
		            System.out.print(array[i][j] + " "); 
		            System.out.println(); 
		    } 

		int i = 0, j = array.length;
		int temp = 0;
		while (i < j) {
			temp = array[i][i];
			array[i][i] = array[j - 1][j - 1];
			array[j - 1][j - 1] = temp;
			temp = array[i][j - 1];
			array[i][j - 1] = array[j - 1][i];
			array[j - 1][i] = temp;
			i++;
			j--;
		}
		for (int k = array.length - 1; k > 0; k--) {
			for (int q = 0; q < array.length; ++q) {
				System.out.print(array[k][q] + " ");
				System.out.println();
			}

		}

	}

}
