package com.win.lap.leetcode;

public class ListSort {
	
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }


	 public static ListNode partition(ListNode head, int x) {
         ListNode lowerHead = null, lowerTail = null;             
         ListNode greaterHead = null, greaterTail = null; 
        ListNode current = head;

    while (current != null)
    {
        if (current.val < x)
        {
            if (lowerHead == null) lowerHead = current;      
            if (lowerTail == null) lowerTail = current;      
            else lowerTail = lowerTail.next = current;      
        }
        else
        {
            if (greaterHead == null) greaterHead = current;  
            if (greaterTail == null) greaterTail = current; 
            else greaterTail = greaterTail.next = current; 
        }

        current = current.next;
    }

    if (greaterHead != null)
        greaterTail.next = null;

    if (lowerHead == null) return greaterHead;
    else
    {
        lowerTail.next = greaterHead;
        return lowerHead;
    }
    }
	 
	 public static void main(String args[]){
		 ListNode head = null;       
	        ListNode node = new ListNode(5);
	        head = node;        
	        node.next = new ListNode(4);
	        node = node.next;       
	        node.next = new ListNode(10);
	        node = node.next;       
	        node.next = new ListNode(15);
	        node = node.next;       
	        node.next = new ListNode(1);
	        node = node.next;       
	        node.next = new ListNode(7);    
	         
	 
	        partition(head, 10);
	        while(head != null) {
	            System.out.print(head.val + ", ");
	            head = head.next;
	        }
	 }
	
}
