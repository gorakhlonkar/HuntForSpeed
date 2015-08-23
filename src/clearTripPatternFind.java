import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


public class clearTripPatternFind {
public static void main(String[] arg) throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
	String input=br.readLine();
	System.out.println(new Date().getTime());
	String inputArr[]=input.split("\\?");
	String inputA[]=inputArr[1].split("\\&");
	for(int i=0;i<inputA.length;i++){
		String[] splitKeyValuePair=inputA[i].split("\\=");
		System.out.println(splitKeyValuePair[0]+": "+splitKeyValuePair[1]);
	}
	System.out.println(new Date().getTime());
}
}
