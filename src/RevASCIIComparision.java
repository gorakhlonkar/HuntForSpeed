import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevASCIIComparision {
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(br.readLine());
		for(int index=0;index<noOfTestCases;index++){
			String inputStr=br.readLine();
			Boolean isFunny=checkFunny(inputStr);
			if(isFunny){
				System.out.println("Funny");
			}
			else{
				System.out.println("Not Funny");
			}
		}
	}
	
	public static Boolean checkFunny(String str){
		StringBuffer revStr=new StringBuffer(str);
		revStr.reverse();
		for(int i=0;i<str.length()-1;i++){
			int diffX=Math.abs(((int) str.charAt(i))-((int)str.charAt(i+1)));
			int diffY=Math.abs(((int) revStr.charAt(i))-((int)revStr.charAt(i+1)));
			if(diffX!=diffY){
				return false;
			}
		}
		return true;
	}
	
	
}
