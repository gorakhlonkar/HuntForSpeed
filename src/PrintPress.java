import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrintPress {

	public static void main(String[] arg) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T>0){
			String str=br.readLine();
			String repStr=br.readLine();
			print(str,repStr);
			T--;
		}
		
	}
	
	public static void print(String str,String repStr){
		if(repStr.length()<=str.length()){
		 int j=0;
		 for(int i=0;i<str.length();i++){
			 int k=i;
			 j=0;
			 while(j<repStr.length()){
				 int c=repStr.charAt(j);
				 int d=str.charAt(k);
				 if(c>=d)
					 break;
				 k++;
				 j++;
			 }
			 if(j==repStr.length()){
				 StringBuffer sbuf=new StringBuffer(str);
				 for(int l=0;l<repStr.length();l++){
//					 "abc".replace("c", "b");
					 sbuf.setCharAt(i,repStr.charAt(l));
					 i++;
				 }
//				 sbuf.replace(i,repStr.length(), repStr);
				 System.out.println(sbuf.toString());
				 return;
			 }
		 }
		}else{
			 StringBuffer sbuf=new StringBuffer(str);
			 int j=0,k=0;
			 for(int i=0;i<str.length();i++){
				 int d=str.charAt(i);
				 j=k;
				 while(j<repStr.length()){
					 int c=repStr.charAt(j);
				 if(c<=d){
					 sbuf.setCharAt(i,repStr.charAt(j));
					 k=j;
					 break;
				 }
					 j++;
				 }
			 }
			 
			 System.out.println(sbuf.toString());
		}
	}

}
