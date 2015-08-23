import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class RoundTableTW {


	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestCases;i++){
			int count=test(Integer.parseInt(br.readLine()));
			System.out.println(count);
		}
	}
	
	public static int test(int numberOfCards){
		int count=0;
		if(numberOfCards<1)
			return 0;
		if(numberOfCards==1)
			return 1;
		ArrayList<Boolean> list=new ArrayList<Boolean>();
		for(int i=0;i<numberOfCards;i++){
			list.add(false);
		}
		int j=0;
		while(!checkAllFliped(list)){
			if(j==0){
				if(list.get(0)==false)
				list.set(0,true);
				else
					list.set(0,false);
				
				if(list.get(1)==false)
				list.set(1,true);
				else
					list.set(1,false);
				
				if(list.get(numberOfCards-1)==false)
				list.set(numberOfCards-1,true);
				else
					list.set(numberOfCards-1,false);
				j++;
			}
			else if(j==numberOfCards-1){
				if(list.get(numberOfCards-1)==false)
				list.set(numberOfCards-1,true);
				else
					list.set(numberOfCards-1,false);
				
				if(list.get(numberOfCards-2)==false)
				list.set(numberOfCards-2,true);
				else
					list.set(numberOfCards-2,false);
				
				if(list.get(0)==false)
				list.set(0,true);
				else
					list.set(0,false);
				j++;
		}else{
			if(list.get(j)==false)
			list.set(j,true);
			else
				list.set(j,false);
			
			if(list.get(j-1)==false)
			list.set(j-1,true);
			else
				list.set(j-1,false);
			
			if(list.get(j+1)==false)
			list.set(j+1,true);
			else
				list.set(j+1,false);
				
			j++;
		}
			if(j>numberOfCards-1)
				j=0;
			count++;
		}
		return count;
	}
	
	public static boolean checkAllFliped(ArrayList<Boolean> list){
		for(Boolean b:list){
			if(b==false)
				return false;
		}
		
		return true;
	}
}

