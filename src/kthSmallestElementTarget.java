import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class kthSmallestElementTarget {
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arrLength=Integer.parseInt(br.readLine());
		String inputstr[]=br.readLine().split("\\s+");
		ArrayList<Integer> inputList=new ArrayList<Integer>();
		for(int arrIndex=0;arrIndex<arrLength;arrIndex++){
			inputList.add(Integer.parseInt(inputstr[arrIndex]));
		}
		
		int NoOfQueries=Integer.parseInt(br.readLine());
		for(int queryIndex=0;queryIndex<NoOfQueries;queryIndex++){
			String[] queryInput=br.readLine().split("\\s+");
			ArrayList<Integer> tempList=new ArrayList<Integer>(inputList);
			sortArr(tempList,0,tempList.size()-1);
			int kthSmallestElement=tempList.get(Integer.parseInt(queryInput[0])-1);
			int x=Integer.parseInt(queryInput[1]);
			addElementToList(tempList,tempList.indexOf(kthSmallestElement));
			sortArr(tempList,0,tempList.size()-1);
			System.out.println(tempList.get(x-1));
		}
	}
	
	public static void sortArr(ArrayList<Integer> arrList,int i,int j){
		int min=i;
		int max=j;
		int pivot=(min+max)/2;
		int element=arrList.get(pivot);
		while(i<=j){
			while(arrList.get(i)<element)
				i++;
			
			while(arrList.get(j)>element)
				j--;
			
			if(i<=j){
				int temp=arrList.get(i);
				arrList.set(i,arrList.get(j));
				arrList.set(j,temp);
				i++;
				j--;
			}
		}
		if(min<j){
			sortArr(arrList,min,j);
		}
		if(i<max){
			sortArr(arrList,i,max);
		}
	}
	
	public static void addElementToList(ArrayList<Integer> inputList,int k){
		int i=0;
		while(i<=k){
			inputList.add(inputList.get(i));
			i++;
		}
	}
	
}
