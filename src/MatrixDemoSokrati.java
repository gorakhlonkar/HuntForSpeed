//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
//public class MatrixDemoSokrati {
//
//	public static void main(String[] arg) throws NumberFormatException, IOException{
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int m=Integer.parseInt(br.readLine());
//		int n=Integer.parseInt(br.readLine());
//		int [][]mat=new int[m][n];
//		for(int i=0;i<m;i++)
//		{
//			String str[]=br.readLine().split("\\s+");
//			for(int j=0;j<n;j++){
//				mat[i][j]=Integer.parseInt(str[j]);
//			}
//		}
//		
//		 int[] outputRow = new int[n];
//		    print(0,m, n,mat, outputRow);
//		
////		printmn(m,n,mat);
//		
//		
//	}
//	
//	
//	public static void printmn(int m,int n,int [][]mat){
//		int ith=m-1,jth=0;
//	 boolean tempmat[][]=new boolean[m][n];
//		for(int i=0;i<m;i++){
//			for(int j=0;j<n;j++){
//				tempmat[i][j]=false;
//			}
//		}
//		for(int i=0;i<n;i++){
//			
//			
//		
//		
//		
//		
//		
//					
//				
//				
//		
//			
//			
//		}
//	
//	
////	private static void print(int j, int row, int col, int[][] first, int[] outputRow) {
////	    for (int i = 0; i < row; i++) {
////	        outputRow[j] = first[i][j];
////	        // recursively continue to populate outputRow until we reach the last column (j == col -1)
////	        if (j < col - 1) {
////	            print(j + 1, row, col, first, outputRow);               
////	        }
////	        // we have reached the last column (j == col -1) so now we could print current permutation
////	        if (j == col - 1) {
////	            for (int k = 0; k < col; k++) {
////	                System.out.print(" " + outputRow[k]);                   
////	            }
////	            System.out.println();                   
////	        }
////	    }
////	
//	
//	
//	void printloop(int n, const int mat[n][n], int buf[n], int ix)
//	{
//	    int i;
//
//	    if (ix == n) {        
//	        for (i = 0; i < n; i++) printf("%2d", buf[i]);
//	        putchar('\n');
//	    } else {
//	        for (i = 0; i < n; i++) {
//	            buf[ix] = mat[ix][i];
//	            printloop(n, mat, buf, ix + 1);
//	        }
//	    }    
//	}
//	
//}
