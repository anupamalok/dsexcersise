package com.win.com.prod;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String args[]){
		List<Integer> qu=new ArrayList<Integer>();
		int size=50;
		Thread prod=new Thread(new Producer(qu,size));
		Thread consum = new Thread(new Comsumer(qu,size));
		prod.start();
		consum.start();
	}

}
