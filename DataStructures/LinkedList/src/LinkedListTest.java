//6-->3--->4--->2--->1
public class LinkedListTest {
	
	public static void main(String args[])
	{
		//Approach 1 - with just Node Class and no LinkedList Class
		/*Node a = new Node (6);
		Node b = new Node (3);
		Node c = new Node (4);
		Node d = new Node (2);
		Node e = new Node (1);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		
		
		System.out.println(a.countNodes(a));
		*/
		//Approach 2
		
		LinkedList list = new LinkedList();
		list.insertAtHead(5);
		list.insertAtHead(9);
		list.insertAtHead(15);
		list.insertAtHead(6);
		list.insertAtHead(50);
		list.insertAtHead(1);
		
		System.out.println(list);
		System.out.println("Length of the Linked List is " + list.length());
	}
	
	
	

}
