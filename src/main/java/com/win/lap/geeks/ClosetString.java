package com.win.lap.geeks;

import java.util.ArrayList;

public class ClosetString {
	/*
	 * Given a list of words followed by two words, 
	 * the task to find the minimum distance between the given two words in the list of words
	 * INPUT
	 * S = { "the", "quick", "brown", "fox", "quick"}
     * word1 = "the"
     * word2 = "fox"
     * output: 3
     * 
	 * */
	
	public static void main(String args[]){
		ArrayList<String> lst=new ArrayList<>();
		//axa ffn ty bs oin bs axa
		/*lst.add("axa");
		lst.add("ffn");
		lst.add("ty");
		lst.add("bs");
		lst.add("oin");
		lst.add("bs");
		lst.add("axa");*/
		
		//jd lzt kym ky gdf gdf jd
		lst.add("jd");
		lst.add("lzt");
		lst.add("kym");
		lst.add("ky");
		lst.add("gdf");
		lst.add("jd");
		System.out.println(findDistance(lst, "kym", "gdf"));
	}
	
	public static int findDistance(ArrayList<String> s, String word1, String word2){
		int d1 = s.lastIndexOf(word1);
		int d2 = s.lastIndexOf(word2);
		System.out.println(d1);
		System.out.println(d2);
		
		return d2-d1;
		
	}

}
