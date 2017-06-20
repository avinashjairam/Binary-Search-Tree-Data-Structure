public class Test{
	public static void main(String [] args){
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder();

		//System.out.println(tree.getRoot().getData() + " " +  tree.getRoot().getLeft().getData() + " " + tree.getRoot().getRight().getData());
	}
}