
public class DoublyEndedLinkedList {

	private Node head;
	private Node tail;
	
	public void insertAtTail(int data) {
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
		}
		
		if(this.tail != null) {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		
	}
	
	//ToString is same as LinkedList to string
	
	
}
