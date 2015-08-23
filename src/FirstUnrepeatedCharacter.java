import java.util.TreeMap;
public class FirstUnrepeatedCharacter {
	public static void main(String[] arg) throws java.lang.Exception{
		String str="abcbcdefa";
		char arr[]=new char[str.length()];
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		arr[0]=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++){
			if(arr[0]==str.charAt(i)){
				int j=0;
				while(j<count){
					arr[j]=arr[j+1];
					j++;
				}
				count--;
				arr[count]='\0';
			}
			else{
				arr[count]=str.charAt(i);
				count++;
			}
		}
		System.out.println(arr[0]);			
	}

}
