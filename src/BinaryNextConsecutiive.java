import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BinaryNextConsecutiive {
	public static void main(String[] arg) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T>0){
			int no=Integer.parseInt(br.readLine());
			int nextNumber=checkNext(no);
			System.out.println(nextNumber);
			T--;
		}
	}
	
	public static int checkNext(int no){
		int res=no;
		if(checkOnes(no)==false)
			return no;
			
		while(checkOnes(no)){
		no++;	
		}
		return no;
		
	}
	
	public static boolean checkOnes(int no){
		int count=0;
		int prevRemainder=0;
		while(no!=0){
			int rem=no&01;
			if(rem==1){
				if(prevRemainder==rem)
					return true;
				prevRemainder=rem;
			}
			else{
				prevRemainder=0;
			}
			no=no>>1;
		}
		
		if(count>1)
		return true;
		else
			return false;
	}
}
