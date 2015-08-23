import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class GoodNumberBadNumber {
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input[]=br.readLine().split("\\s+");
		int gn=Integer.parseInt(input[0]);
		int n=Integer.parseInt(input[1]);
		String[] strArr=br.readLine().split("\\s+");
		HashMap<Integer,Integer> factors=new HashMap<Integer,Integer>();
		int factorsUptoCheck=gn/2;
		factors.put(gn,0);
		for(int j=1;j<=factorsUptoCheck;j++){
			if(!factors.containsKey(j)){
				if((gn%j)==0){
					int secondFactor=gn/2;
					factors.put(j,1);
					factors.put(secondFactor,1);
				}
			}
		}
		int count=0;
		for(Map.Entry<Integer,Integer> ele:factors.entrySet()){
			boolean flag=true;
			for(int i=0;i<n;i++){
				if(Integer.parseInt(strArr[i])==ele.getKey()){
					flag=false;
					break;
				}
			}
			if(flag==true)
				count++;
		}
		System.out.println(count);
	}
}
