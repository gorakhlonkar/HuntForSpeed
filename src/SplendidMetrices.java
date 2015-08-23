import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SplendidMetrices {
	public static void main(String arg[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		printMetrcies(n);
	}
	
	
	public static void printMetrcies(int n){
		
		
		int row=0,col=0,i=0,j=0,k=0,l=0,m=0,count=0;
		int numbers=(int)Math.pow(2,n);
		int noOfIterationRow=numbers/4;
		int noOfIterationCol;
		int mat[][]=new int[numbers][numbers];
		if(n==1){
			for(i=0;i<numbers;i++){
				for(j=0;j<numbers;j++){
					System.out.print(++count+" ");
				}
				System.out.println();
			}
			return;
		}
		
		
		while(noOfIterationRow>0){
			noOfIterationCol=numbers/4;
			j=0;
			i=k;
			while(noOfIterationCol>0){
				mat[i][j]=++count;
				mat[i][j+1]=++count;
				mat[i+1][j]=++count;
				mat[i+1][j+1]=++count;
				mat[i][j+2]=++count;
				mat[i][j+3]=++count;
				mat[i+1][j+2]=++count;
				mat[i+1][j+3]=++count;
				mat[i+2][j]=++count;
				mat[i+2][j+1]=++count;
				mat[i+3][j]=++count;
				mat[i+3][j+1]=++count;
				mat[i+2][j+2]=++count;
				mat[i+2][j+3]=++count;
				mat[i+3][j+2]=++count;
				mat[i+3][j+3]=++count;
				i=k;
				j=j+4;
				noOfIterationCol--;
			}
			k=k+4;
			noOfIterationRow--;
		}
		for(i=0;i<numbers;i++){
			for(j=0;j<numbers;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
