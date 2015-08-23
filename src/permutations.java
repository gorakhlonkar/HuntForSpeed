import java.util.HashMap;
import java.util.Map;


public class permutations {

	public static HashMap<String,Integer> map=new HashMap<String,Integer>();
	public static void main(String[] arg){
		nonRecurSub("abcd");
	}
	
	public static void swap(String str,int currindex){
		char[] newStrArray=str.toCharArray();
		char temp=newStrArray[0];
		newStrArray[0]=newStrArray[currindex];
		newStrArray[currindex]=temp;
		for(char c:newStrArray){
			System.out.print(c);
			
		}
		map.put(newStrArray.toString(),1);
		System.out.println();
		for(int i=0;i<str.length()-1;i++){
			temp=newStrArray[i];
			newStrArray[i]=newStrArray[i+1];
			newStrArray[i+1]=temp;
			for(char c:newStrArray){
				System.out.print(c);
			}
			map.put(newStrArray.toString(), 1);
			System.out.println();
		}
		
	}
	public static void nonRecurSub(String inputStr){
		String tempStr=inputStr;
		int length=inputStr.length();
		for(int i=0;i<length;i++){
			swap(inputStr,i);
		}
		
		for(Map.Entry<String,Integer> entry:map.entrySet())
			System.out.println(entry.getKey().toCharArray());
	}
	
	
}
