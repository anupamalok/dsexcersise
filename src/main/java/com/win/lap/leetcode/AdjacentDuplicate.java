package com.win.lap.leetcode;

import java.util.*;

public class AdjacentDuplicate {

	/*
	 * Given a string s, a k duplicate removal consists of choosing k adjacent
	 * and equal letters from s and removing them causing the left and the right
	 * side of the deleted substring to concatenate together.
	 * 
	 * We repeatedly make k duplicate removals on s until we no longer can.
	 * 
	 * Return the final string after all such duplicate removals have been made.
	 * 
	 * It is guaranteed that the answer is unique.
	 *
	 */
	static class Data {
		char c;
		int count;

		Data(int count, char c) {
			this.c = c;
			this.count = count;
		}
	}

	public static String removeDuplicates(String s, int k) {
		Deque<Data> stack = new ArrayDeque<>();
		stack.push(new Data(0, '#'));

		for (char c : s.toCharArray()) {
			if (stack.peek().c != c) {
				stack.push(new Data(1, c));
			} else {
				int count = stack.peek().count + 1;
				stack.pop();
				if (count != k)
					stack.push(new Data(count, c));
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		while (!stack.isEmpty()) {
			for (int i = 0; i < stack.peek().count; i++) {
				stringBuilder.append(stack.peek().c);
			}
			stack.pop();
		}
		return stringBuilder.reverse().toString();

	}

	public static void main(String args[]) {
		System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
	}

}
