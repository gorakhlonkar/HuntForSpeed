class HuffmanNode{
	public char data;
	public HuffmanNode left;
	public HuffmanNode right;
}


public class HuffmanDecoding {
	public static void main(String[] arg){
		HuffmanNode root=new HuffmanNode();
		root.data='\0';
		root.left=null;
		root.right=null;
		
		
		HuffmanNode node1=new HuffmanNode();
		node1.data='\0';
		node1.left=null;
		node1.right=null;
		
		root.left=node1;
		
		
		HuffmanNode node2=new HuffmanNode();
		node2.data='A';
		node2.left=null;
		node2.right=null;
		
		root.right=node2;
		
		HuffmanNode node3=new HuffmanNode();
		node3.data='B';
		node3.left=null;
		node3.right=null;
		node1.left=node3;
		
		HuffmanNode node4=new HuffmanNode();
		node4.data='C';
		node4.left=null;
		node4.right=null;

		node1.right=node4;
		
		
		decodeString(root,"1001011");
	}
	
	
	public static void decodeString(HuffmanNode rootNode,String s){
		HuffmanNode tempNode=rootNode;
		int i=0;
		while(i<s.length()){
			while(tempNode.left!=null&&tempNode.right!=null){
				char c=s.charAt(i);
				if(c=='1'){
					tempNode=tempNode.right;
					i++;
				}
				if(c=='0'){
					tempNode=tempNode.left;
					i++;
				}
			}
			System.out.print(tempNode.data);
			tempNode=rootNode;
		}
	}
}
