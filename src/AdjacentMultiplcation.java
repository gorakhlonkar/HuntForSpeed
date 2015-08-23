import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AdjacentMultiplcation {

	public static void main(String[] arg) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int no=Integer.parseInt(br.readLine());
		int input[]=new int[no];
		int masterMul=0;
		int adjacentSeq[]=new int[4];
		for(int i=0;i<no;i++){
			input[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<input.length;i++){
			int mul=1;
			for(int j=i;j<(i+3);j++){
				 mul=mul*input[j];
				
			}
			if(mul>masterMul){
				masterMul=mul;
				int index=0;
				for(int k=i;k<4;k++){
					adjacentSeq[index]=input[k];
				}
			}
			
		}
		
		System.out.println(masterMul);
	}
}
