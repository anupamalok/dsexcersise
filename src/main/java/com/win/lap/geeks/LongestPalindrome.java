


package com.win.lap.geeks;

public class LongestPalindrome {
	
	public static void main(String args[]){
		
	}

	public int longestPalinSubseq(String g){
		return 1;
	}
	public boolean checkPalindrome(String s){
		String reverse ="";
		int length = s.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + s.charAt(i); 
	      
	     if(reverse.equals(s)){
	    	 return true;
	     }
	     else
	    	 return false;
	}
}
