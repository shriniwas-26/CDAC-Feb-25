class BST{
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	BST(){
		root = null;
	}
	
	BST(int d){
		root = new Node(d);
	}
	
	void preorder(Node root){
		if(root == null){
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	void postorder(Node root){
		if(root == null){
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	void inorder(Node root){
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	Node insertData(Node root, int key){
		 
		if(root==null){
			root = new Node(key);;
			return root;
		}
		
		if(key<=root.data){
			root.left = insertData(root.left,key);
		}else{
			root.right = insertData(root.right,key);
		}
		
		return root;
	}
	
	void insert(int key){
		root = insertData(root,key);
	}
	
	Node deleteNode(Node root, int key){
		if(root==null){
			return root;
		}
		
		if(key<root.data){
			root.left = deleteNode(root.left,key);
		}else if(key>root.data){
			root.right = deleteNode(root.right,key);
		}else{
			//Case 1: Leaf node delete
			//case 2: Single child delete
			if(root.left == null){
				return root.right;
			}
			if(root.right == null){
				return root.left;
			}
			
			//case 3: Two children deletion
			root.data = minvalue(root.right);
			root.right = deleteNode(root.right, root.data);
			
		}
		return root;
	}
	
	void delete(int key){
		deleteNode(root,key);
	}
	
	int minvalue(Node root){
		int x = root.data;
		while(root.left != null){
			x = root.left.data;
			root = root.left;
		}
		return x;
	}
	
	public static void main(String[] args){
		BST bst = new BST(56);
		bst.insert(72);
		bst.insert(59);
		bst.insert(40);
		bst.insert(44);
		bst.insert(52);
		bst.insert(55);
		bst.insert(36);
		bst.insert(24);
		bst.inorder(bst.root);
		bst.delete(56);
		System.out.println();
		bst.inorder(bst.root);
	}
}