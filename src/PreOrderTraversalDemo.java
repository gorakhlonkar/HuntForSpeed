
class node{
	int data;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public node getLeft() {
		return left;
	}
	public void setLeft(node left) {
		this.left = left;
	}
	public node getRight() {
		return right;
	}
	public void setRight(node right) {
		this.right = right;
	}
	node left;
	node right;
	
}


public class PreOrderTraversalDemo {
	public static void main(String[] arg){
		node root=new node();
		root.setData(0);

		node fnode=new node();
		fnode.setData(1);
		fnode.setLeft(null);
		fnode.setRight(null);
		
		root.setLeft(fnode);

		
		node snode=new node();
		snode.setData(2);
		snode.setLeft(null);
		snode.setRight(null);
		root.setRight(snode);
		
		
		node threeNode=new node();
		threeNode.setData(3);
		threeNode.setLeft(null);
		threeNode.setRight(null);
		fnode.setLeft(threeNode);
		preOrderTraverse(root);
		
	}
	
	public static void preOrderTraverse(node rootNode){
		if(rootNode==null)
			return;
		System.out.println(rootNode.data);
		preOrderTraverse(rootNode.getLeft());
		preOrderTraverse(rootNode.getRight());
		
	}
	
}
