import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CoPrimeFactorTarget {
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int puchiNumber=Integer.parseInt(br.readLine());
		int numOfFrnds=Integer.parseInt(br.readLine());
		int numOfPuchisFrnd=0;
		String frndsArray[]=br.readLine().split("\\s+");
		for(int numfrndIndex=0;numfrndIndex<numOfFrnds;numfrndIndex++){
			for(int factorIndex=2;factorIndex<=(puchiNumber/2);factorIndex++){
				if(((puchiNumber%factorIndex)==0)&&((Integer.parseInt(frndsArray[numfrndIndex])%2)==0)){
					numOfPuchisFrnd++;
					break;
				}
			}
		}
		System.out.println(numOfPuchisFrnd);
	}
}
