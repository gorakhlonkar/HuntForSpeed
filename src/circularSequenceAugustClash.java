import java.io.BufferedReader;
import java.io.InputStreamReader;


public class circularSequenceAugustClash {
	public static void main(String[] arg) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T>0){
			String[] arr=br.readLine().split("\\s+");
			
			
			T--;
		}
	}
	
	
	public static void printS(int n,int p,int k){
		int l=1;
		int ip=1;
		while(l<=k){
			ip=ip+p;
			if(ip>12)
				ip=ip%n;
			l++;
		}
		
		
		
		
		
	}
	
	
}
