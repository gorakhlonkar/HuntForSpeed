import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.attribute.standard.MediaSize.Other;


public class newerMatrix {
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	int n=Integer.parseInt(br.readLine());
	int [][]mat=new int[m][n];
	for(int i=0;i<m;i++)
	{
		String str[]=br.readLine().split("\\s+");
		for(int j=0;j<n;j++){
			mat[i][j]=Integer.parseInt(str[j]);
		}
	}
	
	 int[] outputRow = new int[n];
	printloop1(m,n, mat,outputRow,0);
	 
}

public static void printloop1(int m,int n, int mat[][], int storecombination[], int ix)
{
    int i;

    if (ix == m) {        
        for (i = 0; i < m; i++)
        	System.out.print(storecombination[i]);
//        	printf("%2d", buf[i]);
        System.out.println();
    } else {
        for (i = 0; i < n; i++) {
            storecombination[ix] = mat[ix][i];
            printloop1(m,n, mat, storecombination, ix + 1);
        }
    }    
}


}