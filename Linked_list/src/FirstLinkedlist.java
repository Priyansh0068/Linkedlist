

public class FirstLinkedlist {
private ListNode head; //head node to hold the list
	
	private static class ListNode //Static inner class listnode
	{
		private int data;
		private ListNode next;
	
	public ListNode(int data)
	 {
		 this.data=data;
		 this.next=null;
	 }

	


	public static void main(String[] args) {
		//lets create a linked list
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(6);
		ListNode third=new ListNode(8);
		//Attach them to each other
		head.next=second;
		second.next=third;
		
		

	}

	}}

