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
	}
	
	
}
