

public class printelement {
	//to print all the elements
	public void display(ListNode head) {
	if (head==null)
	{
		return;
	}
	

		ListNode current=head;
		//loop to print all the values
		while(current!=null)
		{
			System.out.print(current.data);//to print the data
			current=current.next;
		}
		
		System.out.print(current);
	}

	
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
		 printelement h= new  printelement();
		 h.display(head);
	}
	}}
