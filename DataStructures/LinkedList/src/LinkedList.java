
public class LinkedList {
	
	private Node head;
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNext(this.head);
		this.head = newNode;
	}
	
	public int length() {
		int length = 0;
		Node current = this.head;
		
		while (current != null) {
			length ++;
			current = current.getNext();
		}
		
		return length;
	}
	
	public String toString() {
		String result = "{ ";
		Node current = this.head;
		while(current != null) {
			result += current.toString() + ", ";
			current = current.getNext();
		}
		result += "}";
		return result;
	}

}
