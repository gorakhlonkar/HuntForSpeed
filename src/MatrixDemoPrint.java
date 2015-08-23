

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MatrixDemoPrint {
	private static ArrayList<int[]> listInt;
	public static void main(String[] args) throws NumberFormatException, IOException{
	    listInt = new ArrayList<int[]>();
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int [][]mat=new int[m][n];
		/*
		 * below code takes input from user
		 */
		for(int i=0;i<m;i++)
		{
			String str[]=br.readLine().split("\\s+");
			for(int j=0;j<n;j++){
				mat[i][j]=Integer.parseInt(str[j]);
			}
		}
		printMatrics(mat);
	    printResult();
	}
	private static void printMatrics(int[][] matrix) {
	    int m = matrix.length;
	    int[] matElementInd = new int[m];
	    int[] RowsTobePrinted = new int[m];
	    for(int i=0;i<m;i++){
	    	RowsTobePrinted[i]=matrix[0].length;
	    }
	    int index = 0;  //index is used to hold current index 
	    int[] arr = new int[m];
	    while(true){
	        while(index >= 0){
	            if(index == m) {
	            	int[] a = new int[arr.length];
	            	for(int j=0;j<arr.length;j++)
	            		a[j]=arr[j];
	          	    listInt.add(a);
	                index--;
	            }
	            if(matElementInd[index] == RowsTobePrinted[index]){
	                matElementInd[index] = 0;
	                index--;	
	            } else break;
	        }
	        if(index < 0) break;
	        arr[index] = matrix[m-index-1][matElementInd[index]++];
	        index++;
	    }
	}
	
	/*
	 * below function prints the result
	 */
	public static void printResult(){
		for(int i=0;i<listInt.size();i++){
	    	int[] arr=listInt.get(i);
	    	for(int j=0;j<arr.length;j++){
	    		if(j==arr.length-1)
	    		System.out.print(arr[j]);
	    		else
	    			System.out.print(arr[j]+",");
	    	}
	    	System.out.println();
	    }
		
	}
	
}