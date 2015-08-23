import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class Node{
	int data;
	Node left;
	Node right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	

}
public class TopViewOfTree {
public static void main(String[] arg){
	TreeNode root=new TreeNode();
	root.setData(0);

	TreeNode fnode=new TreeNode();
	fnode.setData(1);
	fnode.setLeft(null);
	fnode.setRight(null);
	
	root.setLeft(fnode);

	
	TreeNode snode=new TreeNode();
	snode.setData(2);
	snode.setLeft(null);
	snode.setRight(null);
	root.setRight(snode);
	
	
	
	TreeNode snodeL=new TreeNode();
	snodeL.setData(6);
	snodeL.setLeft(null);
	snodeL.setRight(null);
	snode.setLeft(snodeL);
	
	TreeNode snodeR=new TreeNode();
	snodeR.setData(7);
	snodeR.setLeft(null);
	snodeR.setRight(null);
	snode.setRight(snodeR);
	
	TreeNode threeNode=new TreeNode();
	threeNode.setData(3);
	threeNode.setLeft(null);
	threeNode.setRight(null);
	fnode.setLeft(threeNode);
	
	
	
	TreeNode fourthNode=new TreeNode();
	fourthNode.setData(4);
	fourthNode.setLeft(null);
	fourthNode.setRight(null);
	threeNode.setLeft(fourthNode);
	

	TreeNode fifthhNode=new TreeNode();
	fifthhNode.setData(5);
	fifthhNode.setLeft(null);
	fifthhNode.setRight(null);
	threeNode.setRight(fifthhNode);
	
	
	printTopView(root);
	
	
}
	
public static void printTopView(TreeNode rootNode){
	if(rootNode==null)
		return;
	
	Stack st=new Stack();
	
	Queue q=new LinkedList();
	
	TreeNode tempNode=rootNode;
	while(tempNode!=null){
		st.add(tempNode);
		tempNode=tempNode.getLeft();
	}
	
	tempNode=rootNode.getRight();
	while(tempNode!=null){
		q.add(tempNode);
		tempNode=tempNode.getRight();
	}
		
	int stackCount=st.size();
	while(stackCount>0){
		TreeNode t=(TreeNode)st.pop();
		System.out.print(t.getData()+" ");
		stackCount--;
		
	}
	
	int queueSize=q.size();
	while(queueSize>0){
		TreeNode t=(TreeNode) q.poll();
		System.out.print(t.getData()+" ");
		queueSize--;
	}
	
}


	
}
