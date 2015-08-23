import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PairOfSocks {
public static void main(String[] arg) throws NumberFormatException, IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int No=Integer.parseInt(br.readLine());
	for(int i=0;i<No;i++){
		int pairs=Integer.parseInt(br.readLine());
		System.out.println(pairs+1);
	}
}
}
