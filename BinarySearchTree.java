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
		this.root = new Root(data);
	}

	public Node getRoot(){
		return this.root; 
	}

	public int getSize(){
		return this.size;
	}

	public void inorder(){
		inorder(this.root);
	}

	public void inorder(Node node){
		if(node == null){
			return;
		}

		inorder(node.getLeft());

		System.out.print(node.getData());		

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

}