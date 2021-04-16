package com.win.lap.problems;

public class LeftZero {
	/**
     * Input    ---> Expected output
     * 00035718 ---> 35718000
     * 03500718 ---> 35718000
     * 30507018 ---> 35718000
     * 35718000 ---> 35718000
     */
	
	public static void main(String args[]){
		int[] a={0,0,0,3,5,7,1,8};
		numberArrange(a);
	}
	
	static int[] numberArrange(int[] a){
	
		int c=0;
		int t=0;
		for(int i =0;i<a.length;i++){
			if(a[i]!=0){
				t=a[c];
				a[c]=a[i];
				a[i]=t;
				c++;
			}
		}
		for(int u:a){
			System.out.print(u);
		}
		return a;
	}

}
