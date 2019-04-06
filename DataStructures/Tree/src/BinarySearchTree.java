
public class BinarySearchTree {
	
	private TreeNode root;
	
	public void insert(Integer data) {
		if (this.root != null)
			this.root.insert(data);
		else
			this.root = new TreeNode(data);
		
	}
	
	//find
	public TreeNode find(Integer data) {
		if (this.root != null)
			return this.root.find(data);
		return null;
	}
	
	//delete
	public void delete(Integer data) {
		//Iterative approach rather than recursive
		//Case 1: Node to be deleted is a leaf
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		
		if (current == null)
			return;
		//iterate over the tree till the value is found
		//once found, store it in current and also save its parent node in parent and save info if its left or right child
		while (current != null && current.getData() != data) {
			parent = current;
			if(data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		
		//case when the value is not found
		if (current == null)
			return;
		
		//for case 1: when its a leaf node
		if(current.getLeftChild() == null && current.getRightChild()== null) {
			//if the node to be deleted is the root node 
			if (current == root) {
				root = null;
			} else {//if not root node ,just set the corresponding child of the parent as null and the current node will be garbage collected
				if(isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}
		}
		
	}
	
	

}
