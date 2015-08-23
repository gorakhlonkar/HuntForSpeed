import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SortRank {
	public static void main(String arg[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int No=Integer.parseInt(br.readLine());
		String input=br.readLine();
		String []inputArr=input.split("\\s+");
		int arr[]=new int[No];
		for(int  i=0;i<No;i++){
			arr[i]=Integer.parseInt(inputArr[i]);
		}
		ArrayList<Integer> tempArr=new ArrayList<Integer>();
		for(int j=0;j<No;j++){
			tempArr.add(arr[j]);
		}
		
		for(int i=0;i<No;i++){
			for(int j=i+1;j<No;j++){
				if(tempArr.get(i)<tempArr.get(j)){
					int temp=tempArr.get(i);
					tempArr.set(i,tempArr.get(j));
					tempArr.set(j,temp);
				}
			}
		}
		int pos;
		for(int i=0;i<No;i++){
			pos=tempArr.indexOf(arr[i]);
			System.out.println(pos+1);
		}
	}
	
	
}
