import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SDETMatrixDemo {
	public static void main(String[] arg) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T>0){
			String[] input=br.readLine().split("\\s+");
			int r=Integer.parseInt(input[0]);
			int c=Integer.parseInt(input[1]);
			int result=returnOrder(r, c);
			System.out.println(result);
			T--;
		}
		
	}
	
	
	public static int returnOrder(int r,int c) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++){
			a[i]=new int[c];
			b[i]=new int[c]; 
		}
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<r;i++){
			String input[]=br.readLine().split("\\s+");
			for(int j=0;j<c;j++){
				a[i][j]=Integer.parseInt(input[j]);
				if(i==j){
					sum=sum+a[i][j];
				}
			}
		}
		for(int i=0;i<r;i++){
			String input[]=br.readLine().split("\\s+");
			for(int j=0;j<c;j++){
				a[i][j]=Integer.parseInt(input[j]);
				if(i==j){
					sum1=sum1+a[i][j];
				}
			}
		}
		return sum+sum1;
	}
}

