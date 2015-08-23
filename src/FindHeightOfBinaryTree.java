import java.util.LinkedList;
import java.util.Queue;


class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	Boolean visited;
	
	TreeNode(){
		this.left=null;
		this.right=null;
		this.visited=false;
	}
	public Boolean getVisited() {
		return visited;
	}
	public void setVisited(Boolean visited) {
		this.visited = visited;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}


public class FindHeightOfBinaryTree {
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
	fourthNode.setData(5);
	fourthNode.setLeft(null);
	fourthNode.setRight(null);
	threeNode.setRight(fifthhNode);
	
	
	findHeight(root);
}

public static void findHeight(TreeNode rootNode){
	if(rootNode==null)
		return;
	
	Queue q=new LinkedList();
	q.add(rootNode);
	
	int height=0;
	int currentNodesCount=q.size();
	while(currentNodesCount!=0){
		height++;
		while(currentNodesCount>0){
			TreeNode frontNode=(TreeNode)q.poll();
			if(frontNode.getLeft()!=null)
				q.add(frontNode.getLeft());
			if(frontNode.getRight()!=null)
				q.add(frontNode.getRight());
			currentNodesCount--;
	}
		currentNodesCount=q.size();
	}
	System.out.println(height);
}

}
