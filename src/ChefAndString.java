import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ChefAndString {
	public static void main(String[] arg) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T>0){
			String num[]=br.readLine().split("\\s+");
			int strLen=Integer.parseInt(num[0]);
			int no=Integer.parseInt(num[1]);
			String inputStr=br.readLine();
			subStr("",inputStr);
			
			T--;
		}
	}
	
	public static void  subStr(String prefix,String str){
		if(str.length()==0)
			System.out.println(prefix);
		
		for(int i=0;i<str.length();i++){
			subStr(prefix+str.charAt(i),str.substring(i+1,str.length()));
		}
		
	}
}
