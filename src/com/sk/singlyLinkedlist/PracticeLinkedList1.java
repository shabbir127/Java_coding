package com.sk.singlyLinkedlist;import javax.security.auth.callback.LanguageCallback;

public class PracticeLinkedList1 {

	private ListNode head;
	
	public static class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=next;
		}
	}
	
	//display the linked list
    public void display()
    {
    	ListNode current=head;
    	while(current != null)
    	{
    		System.out.print(current.data +" --> ");
    		current =current.next;
    	}
    	System.out.print("null");
    }
    
    // display the length of singly link list
    public void CountLength()
    {
    	int count=0;
    	ListNode current=head;
    	while(current != null)
    	{
    		count ++;
    		current =current.next;
    	}
    	System.out.println("\ncount is :- "+ count);
    }

    //add new linked list at first position
    public void insertfirst(int data)
    {
    	ListNode newNode =new ListNode(data);
    	newNode.next=head;
    	head=newNode;
    	display();
    		
    }
    
    //add new linked at last position
    public void insertEnd(int data)
    {
    	ListNode newNode=new ListNode(data);
    	
    	if (head == null) {
			head=newNode;
			return;
		}
    	
    	ListNode current=head;
    	while(current.next != null)
    	{
    		current=current.next;
    	}
          current.next=newNode;
          
          //this is for the new line in the output section...
          System.out.println();
          display();
    }
	
    //add new linked at any position
    public void insertAnyPosition(int data, int position)
    {
    	ListNode newNode=new ListNode(data);
    	if(position ==1)
    	{
    		newNode.next=head;
    		head=newNode;
    	}else {
			ListNode previous=head;
			int count=1;
			while(count < position-1)
			{
				previous =previous.next;
				count ++;
						
			}
			
			ListNode current=previous.next;
			newNode.next=current;
			previous.next=newNode;
			
		 //this is for the new line in the output section..
			System.out.println();
			display();
		}	
    }
    
    //delete first linked node
    public ListNode deleteFirst()
    {
    	if (head == null) {
			return null;
		}
    	
    	ListNode temp=head;
    	head=head.next;
    	temp.next=null;
    	
    	display();
    	return temp;
    }
    
    //delete last linked node
    public ListNode deleteLast()
    {
    	if (head == null || head.next == null ) {
			
    		return head;
		}
    	
    	ListNode current=head;
    	ListNode previous=null;
    	while(current.next != null)
    	{
    		previous=current;
    		current=current.next;
    	}
    	
    	previous.next=null;
    	return current;
    }
    
  //delete last linked node
    public ListNode deleteAnyposition(int position)
    {
//    	if (position == 0 || position != null ) {
//		System.out.println("Given inputs are null and zero..");
//		return null;
//		}
    	
    	if(position ==1)
    	{
    		ListNode temp=head;
    		head=head.next;
    		return temp;   		
    	}else {
			ListNode previous = head;
			int count =1;
			while(count < position -1)
			{
				previous =previous.next;
				count ++;
			}
			ListNode current= previous.next;
			previous.next=current.next;
			
			return current;	
			
		}
      	
    	
    }
    
    
    
    
    
	public static void main(String[] args) {
		PracticeLinkedList1 pll=new PracticeLinkedList1();
		pll.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(60);
		
		pll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		pll.display();
		pll.CountLength();
		pll.insertfirst(9);
		pll.insertEnd(70);
		pll.insertAnyPosition(40, 5);
		pll.insertAnyPosition(50, 6);
		
		System.out.println("\nFirst node is :- "
				+ ""+pll.deleteFirst().data);
		System.out.println("last Node is :- " + pll.deleteLast().data);
		pll.display(); 
		System.out.println("\ndeleted any position node:- "+ pll.deleteAnyposition(1).data);
	}
	
	
}
