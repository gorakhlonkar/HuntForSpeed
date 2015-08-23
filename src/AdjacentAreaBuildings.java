import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdjacentAreaBuildings {
 public static void main(String[] arg) throws NumberFormatException, IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int No=Integer.parseInt(br.readLine());
	 int inputArr[]=new int[No];
	 String input[]=br.readLine().split("\\s+");
	 for(int i=0;i<No;i++){
		 inputArr[i]=Integer.parseInt(input[i]);
	 }
	 int j=0,k=0,maxArea=0,returnMaxArea=0;
	 maxArea=returnMaxArea(inputArr);
	 System.out.println(maxArea);
//	 int revArr[]=getRevArr(inputArr);
//	 returnMaxArea=returnMaxArea(revArr);
//	 if(maxArea>returnMaxArea)
//		 System.out.println(maxArea);
//	 else
//		 System.out.println(returnMaxArea);
 }
 
 public static int[] getRevArr(int inputArr[]){
	 	int revArr[]=new int[inputArr.length];
	 	int length=inputArr.length-1;
	 	for(int i=length;i>=0;i--){
	 		revArr[length-i]=inputArr[i];
	 	}
	 	return revArr;
 }
 
 public static int returnMaxArea(int inputArr[]){
	 int j=0,k=0,maxArea=0;
	 int No=inputArr.length;
	 while(j<No){
		int tempArea=0;
		int min=findMin(inputArr,j,No);
		tempArea=(No-j)*min;
		if(tempArea>maxArea){
			maxArea=tempArea;
		}
		j++;
	 }
	 return maxArea;
 }
 
 public static void quickSort(int arr[],int i,int j){
		int low=i,high=j;
		int pivotIndex=(low+high)/2;
		int pivot=arr[pivotIndex];
		
		while(i<=j){
			while(arr[i]>pivot)
				i++;
			
			while(arr[j]<pivot)
				j--;
			
			
			if(i<=j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
			if(low<j){
				quickSort(arr,low,j);
			}
			
			if(i<high){
				quickSort(arr,i,high);
			}
		}
	}
 
 public static int  findMin(int inputArr[],int i,int j){
	 int min=(10^6);
	 for(int k=i;k<j;k++){
		 if(inputArr[k]<min)
			 min=inputArr[k];
	 }
	 return min;
 }
}
