import java.util.Stack;



public class InsertIntoBinarySearchTree {
public static void main(String[] arg){
	TreeNode root=new TreeNode();
	root.setData(4);

	TreeNode fnode=new TreeNode();
	fnode.setData(2);
	fnode.setLeft(null);
	fnode.setRight(null);
	
	root.setLeft(fnode);

	
	TreeNode snode=new TreeNode();
	snode.setData(7);
	snode.setLeft(null);
	snode.setRight(null);
	root.setRight(snode);
	
	
	
	TreeNode snodeL=new TreeNode();
	snodeL.setData(1);
	snodeL.setLeft(null);
	snodeL.setRight(null);
	fnode.setLeft(snodeL);
	
	TreeNode snodeR=new TreeNode();
	snodeR.setData(3);
	snodeR.setLeft(null);
	snodeR.setRight(null);
	fnode.setRight(snodeR);
	preOrderTraverse(root);
	TreeNode returnNode=insert(root,6);	
	System.out.println("After");
	preOrderTraverse(root);
	
	
}
	
public static TreeNode insert(TreeNode rootNode,int value){
	TreeNode tempNode=rootNode;
	boolean isReached=true;
	while(isReached){
		if(value<tempNode.getData()){
			if(tempNode.getLeft()!=null){
			tempNode=tempNode.getLeft();
			}
			else
				isReached=false;
		}
		if(value>tempNode.getData()){
				if(tempNode.getRight()!=null){
			tempNode=tempNode.getRight();
		}
				else
				   isReached=true;
		}
		
	}
	
	TreeNode newNode=new TreeNode();
	newNode.setData(value);
	newNode.setLeft(null);
	newNode.setRight(null);

	if(value<tempNode.getData())
		tempNode.setLeft(newNode);
	else
		tempNode.setRight(newNode);
	return rootNode;
}

public static void preOrderTraverse(TreeNode rootNode){
	if(rootNode==null)
		return;
	preOrderTraverse(rootNode.getLeft());
	System.out.println(rootNode.data);
	preOrderTraverse(rootNode.getRight());
	
}


}
