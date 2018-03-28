public class TreeNode {
    private Integer data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Integer data) {
        this.data = data;
    }
    
    public TreeNode find(Integer data) {
    	
    	if (this.data == data)
    		return this;
    	
    	if (data < this.data && left != null)
    		return left.find(data);
  
    	if (right != null)
    		return right.find(data);
    	
    	return null;
    }
    
    public void insert(Integer data) {
    	if (data >= this.data) {
    		if (this.right == null)
    			this.right = new TreeNode(data);
    		else
    			this.right.insert(data);
    	} else {
    		if (this.left == null) 
    			this.left = new TreeNode(data);
    		else
    			this.left.insert(data);
    	}
    }
    
    public void traverseInOrder() {
		if (this.left != null)
			this.left.traverseInOrder();
		System.out.print(this.data + " ");
		if (this.right != null)
			this.right.traverseInOrder();
	}

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return left;
    }

    public TreeNode getRightChild() {
        return right;
    }

    public void setLeftChild(TreeNode left) {
        this.left = left;
    }

    public void setRightChild(TreeNode right) {
        this.right = right;
    }
}