package com.win.lap.problems;

import java.util.Arrays;

public class ArrangeString {

	public static void main(String args[]){
		String s = "ABCDCDDAbDCAAACMDKKRUDKSAFJSAFKDF" ;
	    char[] a=s.toCharArray();
	    Arrays.sort(a);
	    String newdata=new String(a);
	    System.out.println(newdata);
	}
	
	
}
