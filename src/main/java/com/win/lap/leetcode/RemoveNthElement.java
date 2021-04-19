package com.win.lap.leetcode;

public class RemoveNthElement {

	/*
	 * 
	 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
		Follow up: Could you do this in one pass?
	 * 
	 * 
	 * */
	static class ListNode{
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static void main(String args[]){
		
	}
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 int len = 0;
		    ListNode tmp = head;
		    while (tmp != null) 
		    {
		        len++;
		        tmp = tmp.next; 
		    }

		    if (n > len) 
		    {

		        return head; 
		    }
		      
		   
		    else if (n == len) 
		    {
		          
		      
		        return head.next; 
		          
		    }
		    else
		    {
		        
		        int diff = len - n;         
		        ListNode prev= null;     
		        ListNode curr = head;         
		        for(int i = 0; i < diff; i++)
		        {
		            prev = curr;         
		            curr = curr.next;     
		        }
		        prev.next = curr.next;
		        return head;
		    }
		      
	 }
	
}
