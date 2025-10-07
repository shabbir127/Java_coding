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
	
	public static void main(String[] args) {
		PracticeLinkedList1 pll=new PracticeLinkedList1();
		pll.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		
		pll.head.next=second;
		second.next=third;
		third.next=fourth;
		
	}
	
	
}
