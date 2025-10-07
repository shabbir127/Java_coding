package com.sk.singlyLinkedlist;



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
	
	public static void main(String[] args) {
		PracticeLinkedList1 pll=new PracticeLinkedList1();
		pll.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		
		pll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		pll.display();
		pll.CountLength();
		pll.insertfirst(9);
		pll.insertEnd(50);
	}
	
	
}
