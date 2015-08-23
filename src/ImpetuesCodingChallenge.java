import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ImpetuesCodingChallenge {
public static void main(String[] arg) throws IOException
{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	String inputString=br.readLine();
	String n=calculateTriangularPattern(inputString);
	System.out.println(n);
	
}

public static String calculateTriangularPattern(String str){
	String[] strArr=str.split("\\,");
	int input[]=new int[strArr.length];
	ArrayList<Integer> arrInput=new ArrayList<Integer>();
	for(int i=0;i<strArr.length;i++){
		System.out.println(strArr[i]
				);
		arrInput.add(Integer.parseInt(strArr[i]));
	}
	if(strArr.length==1){
		System.out.println(arrInput.get(0));
		
	}
	int length=arrInput.size();
	int flag=0;
	int seq=0;
	ArrayList<Integer> tmparray=new ArrayList<Integer>();
	while(length!=1){
		seq++;
		if((seq%2)!=0){
			for(int j=0;j<length-1;j++){
					if(j==0){
						tmparray=new ArrayList<Integer>();
					}
					int diff=arrInput.get(j+1)-arrInput.get(j);
					tmparray.add(diff);
			}
			length=tmparray.size();
		}
		else{
		for(int j=0;j<length-1;j++){
				if(j==0){
					arrInput=new ArrayList<Integer>();
				}
				int diff=tmparray.get(j+1)-tmparray.get(j);
				arrInput.add(diff);
			}
		length=arrInput.size();
		}
		
	}
	if(arrInput.size()==1){
		return arrInput.get(0).toString();
	}
	if(tmparray.size()==1){
		return tmparray.get(0).toString();
	}
return "";
}

}
