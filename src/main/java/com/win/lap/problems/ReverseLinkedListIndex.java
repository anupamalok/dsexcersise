package com.win.lap.problems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Given a Linked list, push all the even INDEXED elements to the end
0th, 2nd, 4th... elements to the end in that order.
1st, 3rd, 5th.. elements should be in the front, in that order.
2 -> 3 -> 4 -> 8 -> 6
2 -> 4 -> 6 -> 3 -> 8
*/
public class ReverseLinkedListIndex {
	private static class Node {
		public Node next;
		public int value;

		public Node(int values, Node next) {
			value = values;
			this.next = next;
		}

		static Node seg(Node head) {
			Node odd = head;
			Node even = null;
			Node temp = null;
			while (odd != null) {
				if (odd.next != null) {
					Node nptr = odd.next;
					odd.next = odd.next.next;
					nptr.next = even;
					even = nptr;
				}
				temp = odd;
				odd = odd.next;
			}

			temp.next = even;
			return head;
		}

		static void printHead(Node head) {
			Node nod = head;
			while (nod != null) {
				System.out.print(nod.value + " -> ");
				nod = nod.next;
			}

		}

		public static void main(String args[]) throws Exception {
			// 2 -> 3 -> 4 -> 8 -> 6
			// 2 -> 4 -> 6 -> 3 -> 8
			int[] k = { 2, 3, 4, 8, 6 };
			Node head = null;
			for (int i = 0; i < k.length; i++) {
				head = new Node(k[i], head);
			}

			printHead(seg(head));
		}
	}

}
