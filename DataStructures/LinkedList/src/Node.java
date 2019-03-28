

public class Node {
	
	int data;
	Node next;
	int numOfNodes;
	
	Node (int data) {
		this.data = data;
	}
	
	public  int countNodes(Node head) {
		if (head.next != null) {
			countNodes(head.next);
			numOfNodes ++;
		}
		return numOfNodes+1;
	}
	
}
