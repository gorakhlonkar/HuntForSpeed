import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InsertionSort {
	public static void main(String[] arg) throws NumberFormatException, IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int arrLength=Integer.parseInt(br.readLine());
	String inputstr[]=br.readLine().split("\\s+");
	int arr[]=new int[arrLength];
	for(int i=0;i<arrLength;i++){
		arr[i]=Integer.parseInt(inputstr[i]);
	}
	int j=0;
	while(arr[arrLength-1]>arr[j]){
		j++;
	}
	int temp=arr[arrLength-1];
	for(int k=arrLength-1;k>j;k--){
		arr[k]=arr[k-1];
		for(int no:arr){
			System.out.print(no+" ");
		}
		System.out.println();
	}
	arr[j]=temp;
	for(int no:arr){
		System.out.print(no+" ");
	}
	
	}
}
