
public class MatrixDemo {

	public static void main(String[] arg){
		int d=2;
//		String[] str={"E#D#E#E#E","D#I#S#K#E","E#S#E#E#E","E#C#E#E#E","E#E#E#E#E"};
		String[] str={"A#S","S#T"};
				
		String s="AS";
		word_count(d,str,s);
		
	}
	public static int word_count(int input1,String[] input2,String input3)
	{
	    String multiDrray[][]=new String[input1][input1];
	    for(int i=0;i<input1;i++){
	    	multiDrray[i]=new String[input1];
	    }
	    for(int i=0;i<input2.length;i++){
	    	String param[]=input2[i].split("\\#");
	    	for(int j=0;j<input1;j++){
	    		multiDrray[i][j]=param[j];
	    	}
	    	
	    }
	    int hzCount=countHorizontally(multiDrray,input1,input3);
	    int vtCount=countVertically(multiDrray, input1, input3);
	    int digonallyLeftToRight=countDigonallyLefttoRight(multiDrray, input1, input3);
	    int digonallyRightToleft=countDigonallyRightToLeft(multiDrray, input1, input3);
	    int finalCount=hzCount+vtCount+digonallyLeftToRight+digonallyRightToleft;
	    System.out.println(finalCount);
	    
		return 0;
	}
	
	public static int countHorizontally(String[][] str,int d,String strTobeSearched){
		int horizontalCount=0;
		for(int i=0;i<d;i++){
			String temp="";
			for(int j=0;j<d;j++){
				temp=temp+str[i][j];
			}
			if(temp.contains(strTobeSearched)){
				horizontalCount++;
			}
		}
		return horizontalCount;
	}
	
	public static int countVertically(String[][] str,int d,String strTobeSearched){
		int verticalCount=0;
		for(int i=0;i<d;i++){
			String temp="";
			for(int j=0;j<d;j++){
				temp=temp+str[j][i];
			}
			if(temp.contains(strTobeSearched)){
				verticalCount++;
			}
		}
		return verticalCount;
	}
	
	public static int countDigonallyLefttoRight(String[][] str,int d,String strTobeSearched){
		int digonalCount=0;
		int j=0;
		String temp="";
		for(int i=0;i<d;i++){
			temp=temp+str[i][j];
			j++;
		}
		StringBuffer sb=new StringBuffer(temp).reverse();
		if(temp.contains(strTobeSearched)||sb.toString().contains(strTobeSearched)){
			digonalCount++;
		}
		return digonalCount;
	}
	
	public static int countDigonallyRightToLeft(String[][] str,int d,String strTobeSearched){
		int digonalCount=0;
		int j=0;
		String temp="";
		for(int i=d-1;i>=0;i--){
			temp=temp+str[j][i];
			j++;
		}
		StringBuffer sb=new StringBuffer(temp).reverse();
		if(temp.contains(strTobeSearched)||sb.toString().contains(strTobeSearched)){
			digonalCount++;
		}
		return digonalCount;
	}
	
}


