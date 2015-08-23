import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DigonalAddition {
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int dimension=Integer.parseInt(br.readLine());
		int arr[][]=new int[dimension][dimension];
		int leftDigonalSum=0;
		int rightDigonalSum=0;
		for(int i=0;i<dimension;i++){
			String[] line=br.readLine().split("\\s+");
			arr[i]=new int[dimension];
			for(int j=0;j<dimension;j++){
				arr[i][j]=Integer.parseInt(line[j]);
				if(i==j){
					leftDigonalSum=leftDigonalSum+arr[i][j];
				}
			}
			rightDigonalSum=rightDigonalSum+arr[i][(dimension-1)-i];
		}
		System.out.println(Math.abs(leftDigonalSum-rightDigonalSum));
	}
}
