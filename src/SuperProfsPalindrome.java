import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SuperProfsPalindrome {
	public static void main(String[] arg) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String[] inputStrs=new String[T];
		for(int i=0;i<T;i++)
			inputStrs[i]=br.readLine();
		int countPair=0;
		Boolean isVisited[]=new Boolean[T]; 
		for(int i=0;i<T;i++){
			for(int j=i+1;j<T;j++){
				boolean isPal=isPalindrome(inputStrs[i],inputStrs[j]);
				if(isPal){
					countPair++;
				}
			}
		}
		System.out.println(countPair);
	}
	
	public static boolean isPalindrome(String str1,String str2){
		StringBuffer sbuf=new StringBuffer(str2);
		sbuf.reverse();
		if(sbuf.toString().equals(str1))
			return true;
		else
			return false;
	}
	
}
