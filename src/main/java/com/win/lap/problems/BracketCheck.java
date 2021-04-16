package com.win.lap.problems;

import java.util.Stack;

public class BracketCheck {
	
	/**
     * Input  --> Response
     * "{}{}" --> Symmetric
     * "{{}}" --> Symmetric
     * "{}{{}}" --> Symmetric
     * "}{{}" --> Asymmetric
     * "}{" --> Asymmetric
     * "{{" --> Asymmetric
     * "{}{" --> Asymmetric
     */
	
	public static void main(String args[]){
		System.out.println(checkBracket("{}{"));
	}

	
	static String checkBracket(String b){
		Stack<Character> brack=new Stack<>();
		char[] c = b.toCharArray();
		for(int i=0;i<c.length;i++){
		if(c[i] == '{' ){
			brack.push('{');
		}else{
			if(!brack.empty()){
			brack.pop();
			}
			}
		}
		
		if(brack.size() == 0){
			return "Symmetric";
		}
		else
			return "ASymmetric";
					
	}
}
