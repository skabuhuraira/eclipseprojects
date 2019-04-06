
public class TreeNode {
	
	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(Integer data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public Integer getData() {
		return data;
	}
	
	public TreeNode find(Integer data) {
		if (this.data == data)
			return this;
		if (data < this.data && this.getLeftChild() != null)
			return this.getLeftChild().find(data);
		if (this.getRightChild() !=null)
			return this.getRightChild().find(data);
		return null;
	}
	
	public void insert(Integer data) {
		if(data < this.data) {
			if(this.getLeftChild() == null)
				this.setLeftChild(new TreeNode(data));
			else
				this.getLeftChild().insert(data);
		} else {
			if(this.getRightChild() == null)
				this.setRightChild(new TreeNode(data));
			else
				this.getRightChild().insert(data);
		}
	}
	
	
	
	

}
