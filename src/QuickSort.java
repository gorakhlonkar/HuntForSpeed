
public class QuickSort {
	public static void main(String []arg){
		int inputArr[]={4,3,5,1,7};
		for(int i=0;i<inputArr.length;i++){
			System.out.print(inputArr[i]+" ");
		}
		quickSort(inputArr, 0, inputArr.length-1);
		System.out.println();
		for(int i=0;i<inputArr.length;i++){
			System.out.print(inputArr[i]+" ");
		}
		
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
	
	
}
