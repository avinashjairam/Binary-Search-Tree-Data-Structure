public class BinarySearchTree{
	private Node root; 
	private int size;

	public BinarySearchTree(int data){
		root = new Node(data);
		this.size = 0;
	}

	public BinarySearchTree(){
		root = null;
		this.size = 0;
	}

	public void setRoot(int data){
		this.root = new Node(data);
	}

	public Node getRoot(){
		return this.root; 
	}

	public int getSize(){
		return this.size;
	}

	public void inorder(){
		System.out.println();
		this.inorder(this.root);
	}

	public void inorder(Node node){
		if(node == null){
			return;
		}

		inorder(node.getLeft());

		System.out.print(node.getData() + " ");		

		inorder(node.getRight());
	}

	public void preorder(){
		preorder(this.root);
	}

	public void preorder(Node node){
		if(node == null){
			return;
		}

		System.out.print(node.getData());

		System.out.print(node.getLeft());

		System.out.print(node.getRight());
	}

	public void postorder(){
		System.out.println();
		postorder(this.root);
	}

	public void postorder(Node node){
		if(node == null){
			return;
		}

		System.out.print(node.getLeft());

		System.out.print(node.getRight());

		System.out.print(node.getData());

	}

	//A method to find a node in a Binary Search Tree

	public Node search(Node node, int key){

		//Base case: if the root is null or the root's key matches the key being searched for
		if(root == null || key == this.root.getData()){
			return root;
		}

		//If the key is less than the value of the current node, go the the left node
		if(key < node.getData()){
			search(node.getLeft(), key);
		}

		//Otherwise, go the right node
		else{
			search(node.getRight(), key);
		}

		return node;
	}

	//Wrapper Method used to insert a node into a binary tree 
	public void insert(int key){
	 root = insert(this.root, key);
	}


	//Recurisve  insert method which actually inserts a node into the tree
	public Node insert(Node node, int key){
		
		//If the tree is empty, return a new node 
		if(node == null){
			node = new Node(key);
			return node;
		}
		//Otherwise, traverse the tree
		else if(key < node.getData()){
			node.setLeft(insert(node.getLeft(), key));
		}
		else{
			node.setRight(insert(node.getRight(), key));
		}

		return node;
	}

}