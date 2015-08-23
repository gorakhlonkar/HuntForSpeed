
public class GeneratePossibleBrackets {
	public static char arr[];
	public static void main(String[] arg) throws java.lang.Exception{
//		printBr(3);
		printAnotherWay(3,0,"");
	}
	
	public static void printBr(int n){
		printActual(0, n,0,0);
		return;
	}
	
	
	
	public static void printActual(int pos,int n,int open,int close){
		arr=new char[100];
		if(close==n){
			System.out.println();
			for(char c:arr)
			System.out.print(c);
			return;
		}
		else{
			if(open>close){
				arr[pos]='}';
				printActual(pos+1, n, open, close+1);
			}
			if(open<close){
				arr[pos]='{';
				printActual(pos+1, n, open+1, close);
			}
			
		}
		
	}
	
	public static void printAnotherWay(int open,int close,String s){
		if(open==0&&close==0)
			System.out.println(s);
		
		
		if(open>0)
			printAnotherWay(open-1, close+1, s+"(");
		
		if(close>0)
			printAnotherWay(open, close-1, s+")");
	}
	
	
}
