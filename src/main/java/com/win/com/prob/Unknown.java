package com.win.com.prob;

public class Unknown {
	public static void main(String[] args){
		int[] arr={1,4,5,7,8,9,3};
		int b=0,c=0,a=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>a){
			c=b;
			b=a;
			a=arr[i];
			}
			else if(arr[i]>b){
			c=b;
			b=arr[i];
			}
			else if(arr[i]>c){
			c=arr[i];
			}
		}
		System.out.println(c);

		}	
}
