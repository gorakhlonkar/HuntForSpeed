import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class HashingBy10 {
	
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestCases;i++){
			HashMap<Integer,Integer> hashIndexCountMap=new HashMap<Integer,Integer>();
			for(int j=0;j<=9;j++){
				hashIndexCountMap.put(j,0);
			}
			int noOfIntegersTobeHashed=Integer.parseInt(br.readLine());
			String input=br.readLine();
			String inputArr[]=input.split("\\s+");
			int no,rem,currentCount;
			for(int k=0;k<noOfIntegersTobeHashed;k++){
				no=Integer.parseInt(inputArr[k]);
				rem=no%10;
				currentCount=hashIndexCountMap.get(rem);
				hashIndexCountMap.put(rem,currentCount+1);
			}
			int noOfColisions=0;
			for(int j=0;j<=9;j++){
				if(hashIndexCountMap.get(j)>1)
				noOfColisions+=hashIndexCountMap.get(j)-1;
			}
			System.out.println(noOfColisions);
		}
	}
}
