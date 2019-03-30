

public class Node {
	
	private int data;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	private Node next;
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node (int data) {
		this.data = data;
	}
	
	
	public String toString() {
		return "Data: " + this.data;
	}
	
}
