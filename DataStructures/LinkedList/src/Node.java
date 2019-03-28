

public class Node {
	
	int data;
	Node next;
	int numOfNodes;
	
	Node (int data) {
		this.data = data;
	}
	
	public  int countNodes(Node head) {
		Node current = head;
		//Use while loop or the recursive method 
		if (current.next != null) {
			countNodes(current.next);
			numOfNodes ++;
		}
		return numOfNodes+1;
	}
	
}
