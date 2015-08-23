


public class RecursionDownDrill {
	public static int count;
	public static void main(String arg[]){
		int a[]={1,2,3,4};
//		int fact=print1(5);
		new RecursionDownDrill().printArr(a,0);
		new RecursionDownDrill().printString("","abcd");
//		new RecursionDownDrill().printd(123);
//		System.out.println(fact);
	}
	
	public static void print(int a[]){
		
	}
	
	public static int print1(int a){
		int fact=1;
		if(a==1)
			return 1;
		
		fact=a*print1(a-1);
		System.out.println(fact);
		return fact;
	}
	
	public void printd(int a){
		if(a<0)
			return;
		int div=a/10;
		if(div>0){
			printd(a/10);
			System.out.println(a%10);
		}
		
	}
	
	public void printArr(int a[],int index){
		if(index>a.length-1)
			return;
		System.out.println(a[index]);
		printArr(a,index+1);
		System.out.println(a[index]);
		
	}
	
	public void printString(String pre,String str){
		if(str.length()==0){
			count++;
			System.out.println(count+":"+pre);
		}
		
		for(int i=0;i<str.length();i++){
			printString(pre+str.charAt(i),str.substring(0,i)+str.substring(i+1));
		}
		
	}
}
