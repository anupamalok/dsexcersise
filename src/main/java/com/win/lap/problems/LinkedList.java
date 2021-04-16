package com.win.lap.problems;

public class LinkedList {
 
	Node head;
	public static void main(String args[]){
		LinkedList ls = new LinkedList();
		ls.push(7);
		ls.push(8);
		ls.push(9);
		ls.push(5);
		ls.printLinkedList();
		ls.delete(7);
		System.out.println("");
		ls.printLinkedList();
	}
	
	public void push(int data){
		   Node nNode= new Node(data);
		   nNode.next = head;
		   head = nNode;
	  }
	
	void delete(int dData){
		Node temp = head, prev = null; 
        if (temp != null && temp.data == dData) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        while (temp != null && temp.data != dData) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        if (temp == null) return; 
  
        prev.next = temp.next; 
	}
	public void printLinkedList(){
		Node nNode=head;
		while(nNode != null){
			System.out.print(nNode.data +"->");
			nNode = nNode.next;
		}
	}
}
 class Node {
	  int data;
	  Node next;
	  public Node(int data){
		  this.data = data;
		  next = null;
	  }
	  
	}

