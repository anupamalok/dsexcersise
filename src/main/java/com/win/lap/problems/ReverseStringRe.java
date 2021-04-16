package com.win.lap.problems;

public class ReverseStringRe {
	
	public static void main(String args[]){
		System.out.println(reversestring("My name is Khan"));
	}
	
	static String reversestring(String str){
		if ((str==null)||(str.length() <= 1)) 
	          return str; 
	        else
	        { 
	           // System.out.print(str.charAt(str.length()-1)); 
	            return reversestring(str.substring(0,str.length()-1)).toString(); 
	        } 
	}

}
