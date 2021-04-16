package com.win.lap;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class BackTracing {
	public static void main(String args[]){
		
		boolean isbydiby5= 0%5 ==0;
		try{}catch(ArithmeticException a){
			System.out.println("e");
		}
	}
	
	static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.println(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
            System.out.println(str.substring(0, i) +" :: "+ str.substring(i + 1));
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
	
	public String getCity(){
		return "A";
	}
	
	public String getState(){
		return "j";
	}
	public String getZip(){
		return "1234";
	}

}
