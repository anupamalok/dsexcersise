package com.win.lap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicate {

	public static void main(String args[]){
		Integer a[]={1,3,1,2,4,5,6,8};
		List<Integer> l = Arrays.asList(a);
		Set<Integer> s= new HashSet<>(l.size());
		s.addAll(l);
		System.out.println(l);
		System.out.println(s);
		int actual = l.size() - s.size();
		actual = actual +1;
		System.out.println(actual);
	}
	
}
