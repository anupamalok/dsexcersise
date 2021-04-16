package com.win.lap.problems;

public class SequencePrint extends Thread{

	public static void main(String args[]) {
		int[][] Darr = { { 1, 2, 3, 4, 6 }, { 5, 4, 3, 5, 7 }, { 6, 5, 9, 8, 9 }, { 9, 8, 7, 6, 1 },
				{ 1, 8, 3, 6, 2 } };
		printPattern(Darr);
	}

	static void printPattern(int[][] arr2d) {
		for (int r = 0; r < 5; r++) {
			int k = 0;
			int v = r;
			while (v != -1 && k <= r) {
				System.out.print(arr2d[k][v]);
				v--;
				k++;
			}
			System.out.println();
		}
		for(int i = 1 ; i< 5 ; i++)
		{
		  int k = i;
		  int v = 5-1 ;
		   while(k<5)
		   {
			   System.out.print(arr2d[k][v]);
			   k++;
			   v--;
		   }
		   System.out.println();
		}	

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
