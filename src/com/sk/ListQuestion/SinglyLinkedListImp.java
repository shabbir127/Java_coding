  package com.sk.ListQuestion;

public class SinglyLinkedListImp {
	
	private ListNode head;
	
	//class
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		SinglyLinkedListImp sll=new SinglyLinkedListImp();
		sll.head=new ListNode(10);
		
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth =new ListNode(11);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
	}

}
