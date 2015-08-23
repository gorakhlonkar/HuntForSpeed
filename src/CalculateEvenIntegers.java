import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CalculateEvenIntegers {
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inputStr=br.readLine();
		int totalEvenCount=countEvenInt(inputStr);
		int trackEven=0;
		for(int i=0;i<inputStr.length();i++){
			int no=((int)inputStr.charAt(i)%49)+1;
			System.out.print((totalEvenCount-trackEven)+" ");
			if(no%2==0)
				trackEven++;
		}
	}
	
	public static int countEvenInt(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			int no=((int)str.charAt(i)%49)+1;
			if((no%2)==0)
				count++;
			
		}
			return count;
	}
		
	
	
}
