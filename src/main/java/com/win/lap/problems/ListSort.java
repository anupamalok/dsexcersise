package com.win.lap.problems;

public class ListSort {

	 public ListNode partition(ListNode head, int x) {
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
	
}
