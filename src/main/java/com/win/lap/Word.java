package com.win.lap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {
	
	public static void main(String args[]){
		System.out.println(homay(" )}OJR 92ww. z )UPl 49e ]S  g. zrZEnQ  D. FoKp ]ow 1EceB 3oK }w ]CA? L 3LPbDN! trqJY 0sBmm. Nwn"));
	}
	
	public static int homay(String senten){
		// Write your code here
	    int count,c =1;
	    String[] words = senten.trim().split(" ");
	    count = words.length;
	    String specialCharactersString = "!@#$%&*()'+/:;<=>[]^_`{|}";
	    for(int i=0;i<words.length;i++){
	               try{
	                   Double.parseDouble(words[i]);
	                   System.out.println("No exc" + words[i]);
	                   count = count - 1;
	               } catch(NumberFormatException nEx){
	            	   boolean flag = false;
	            	   if(!words[i].isEmpty()){
	            	   for (int j=0; j < words[i].length() ; j++)
	                   {  
	            		  
	                       char ch = words[i].trim().charAt(j);
	                       if(specialCharactersString.contains(Character.toString(ch))) {
	                    	  // System.out.println(words[i]);
	                          flag = true;
	                       }    
	                   }
	            	   if(flag){
	            	   count = count -1;
	            	   }
	            	   else 
	            		   System.out.println(words[i]+ ":" + c++ );
	               }
	            	   else{
	            		   count = count -1;
	            	   }
	            	   
	            	   }
	    }
	return count;
	}

}
