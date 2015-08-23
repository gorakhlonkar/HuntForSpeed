import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UrbanCoding {
	static int count=0;
	
	public static void  main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(br.readLine());
		UrbanCoding urbanCoding=new UrbanCoding();
		for(int index=0;index<noOfTestCases;index++){
			String inputStr=br.readLine();
			urbanCoding.subseq(inputStr);
			int output=count%(10^9+7);
			System.out.println(output);
			count=0;
		}
	}

	public void subseq(String inputStr){
		subsequence("",inputStr);
	}
	public void subsequence(String initial,String str){
		
		if(initial.length()!=0){
		int number=Integer.parseInt(initial);
			if((number%6)==0){
				count=count+1;
			}
		}
		for(int i=0;i<str.length();i++){
			subsequence(initial+str.charAt(i),str.substring(i+1,str.length()));
		}
		
	}
	
}
