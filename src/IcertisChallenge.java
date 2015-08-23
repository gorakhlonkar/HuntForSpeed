import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class IcertisChallenge {
	public static void main(String arg[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(3);
		number.add(9);
		number.add(8);
		number.add(4);
		number.add(5);
		number.add(7);
		number.add(10);
		ArrayList<Integer> partial=new ArrayList<Integer>();
		int a[]={};
		printSubset(number,15);
//		printSubset(a,15, arr);
	}
	
	
//	public static void printSubset(int remaining[],int sum,int arr[]){
//		int s=getSum(remaining);
//		if(s==sum){
//			System.out.println();
//			for(int ele:remaining)
//				System.out.print(ele+"");
//		}
//		
//		for(int i=0;i<arr.length-1;i++){
//			int n=arr[i];
//			int partial[]=new int[(arr.length-1)-i];
//			for(int j=i+1;j<arr.length-1;j++)
//				partial[j]=arr[j];
//			remaining[i]=n;
//			printSubset(remaining, sum,partial);
//			
//		}
//		
//		
//	}
	
	public static void printSubset(ArrayList<Integer> numbers,int target){
		printSet(numbers, target,new ArrayList<Integer>());
	}
	
	public static void printSet(ArrayList<Integer> numbers,int target,ArrayList<Integer> partial){
		int s=getSum(partial);
		if(s==target){
			System.out.println();
			for(Integer ele:partial)
				System.out.print(ele+"");
		}
		if(s>=target)
			return;
		for(int i=0;i<numbers.size();i++){
			ArrayList<Integer> remaining=new ArrayList<Integer>();
			int n=numbers.get(i);
			for(int j=i+1;j<numbers.size();j++)
				remaining.add(numbers.get(j));
			
			ArrayList<Integer> partial_rec=new ArrayList<Integer>(partial);
			partial_rec.add(n);
			printSet(remaining, target, partial_rec);
		}
		
	}
	
	public static int getSum(ArrayList<Integer> remaining){
		Integer sum=0;
		for(Integer i:remaining)
			sum=sum+i;
		return sum;
	}
	
}


