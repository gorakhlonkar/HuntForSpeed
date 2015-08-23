import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class XseedOperations {
	public static HashMap<Character,Integer> charPositionMap=new HashMap<Character, Integer>();
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		fillCharPositionMap();
		String firstLineArr[]=(br.readLine()).split("\\s+");
		int lengthOfString=Integer.parseInt(firstLineArr[0]);
		int noOfOperations=Integer.parseInt(firstLineArr[1]);
		String inputString=br.readLine();
		for(int opertionIndex=0;opertionIndex<noOfOperations;opertionIndex++){
			String input=br.readLine();
			String inputArr[]=input.split("\\s+");
			switch(Integer.parseInt(inputArr[0])){
			case 0:
				StringBuffer temp=new StringBuffer(inputString);
				temp.setCharAt(Integer.parseInt(inputArr[1])-1,inputArr[2].charAt(0));
				inputString=temp.toString();
				break;
			case 1:
				if(Integer.parseInt(inputArr[1])<1&&(Integer.parseInt(inputArr[2]))>inputString.length())
				{
					System.out.println("Out of range");
					break;
				}
				
				String SortedString=getKthSmallestChar(inputString,lengthOfString, Integer.parseInt(inputArr[1])
						,Integer.parseInt(inputArr[2])
						,Integer.parseInt(inputArr[3]));
				
				if((Integer.parseInt(inputArr[3]))>SortedString.length())
				System.out.println("Out of range");
				else
					System.out.println(SortedString.charAt(Integer.parseInt(inputArr[3])-1));
				break;
			}
		}
	}
	
	public static String getKthSmallestChar(String inuptStr,int lOS,int left,int right,int k){
		if(right>lOS){
			right=lOS;
		}
		String sortedString=sortLexiographically(inuptStr.substring(left-1,right));
		return sortedString;
	}
	
	public static String sortLexiographically(String subStr){
		StringBuffer sb=new StringBuffer(subStr);
		int posX,posY;
		for(int i=0;i<sb.length();i++){
			for(int j=i+1;j<sb.length();j++){
//				Character charX=new Character(sb.charAt(i));
//				Character charY=new Character(sb.charAt(j));
//				posX=charPositionMap.get(sb.charAt(i));
//				posY=charPositionMap.get(sb.charAt(j));
				if(charPositionMap.get(sb.charAt(i))>charPositionMap.get(sb.charAt(j))){
					char temp=sb.charAt(i);
					sb.setCharAt(i,sb.charAt(j));
					sb.setCharAt(j,temp);
				}
			}
		}
		return sb.toString();
		
	}
	public static  void fillCharPositionMap(){
		charPositionMap.put('a',1);charPositionMap.put('b',2);
		charPositionMap.put('c',3);charPositionMap.put('d',4);
		charPositionMap.put('e',5);charPositionMap.put('f',6);
		charPositionMap.put('g',7);charPositionMap.put('h',8);
		charPositionMap.put('i',9);charPositionMap.put('j',10);
		charPositionMap.put('k',11);charPositionMap.put('l',12);
		charPositionMap.put('m',13);charPositionMap.put('n',14);
		charPositionMap.put('o',15);charPositionMap.put('p',16);
		charPositionMap.put('q',17);charPositionMap.put('r',18);
		charPositionMap.put('s',19);charPositionMap.put('t',20);
		charPositionMap.put('u',21);charPositionMap.put('v',22);
		charPositionMap.put('w',23);charPositionMap.put('x',24);
		charPositionMap.put('y',25);charPositionMap.put('z',26);
	}
	
}
