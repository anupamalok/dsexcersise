package com.win.lap.problems;

public class SmalestContinousString {
	
	public static void main(String args[]){
		new SmalestContinousString().opeartion();
	}
	
	/*
	 * input timetopractice as String should contain toc
	 * 
	 * */
	
/*	char[] c= "timetopractice".toCharArray();
	char[] rst = "toc".toCharArray();*/
	
	char[] c ="thisisateststring".toCharArray();
	char[] rst= "tist".toCharArray();
	public void opeartion (){
		String actual="";
		String temp="";
		int j=0;
		String perform="";
		int start=0;
		for(int i=0;i<c.length;i++){
			if(c[i] == rst[j]){
				temp=temp+c[i];
				j++;
			}else if(!temp.equals("")){
				if(c[i] == rst[0]){
					temp = ""+c[i];
				}else
					temp = temp+c[i];
			}
			if(j == rst.length){
				j=0;
				actual = actual +" " + temp;
				temp = "";
			}
		}
	System.out.println(actual);	
	}
	
	public boolean constraint(){
		return true;
	} 
}
