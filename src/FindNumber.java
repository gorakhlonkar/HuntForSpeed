import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindNumber {
public static void main(String[] arg) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String input=br.readLine();
	String inputArr[]=input.split("\\s");
	int row=Integer.parseInt(inputArr[0]);
	int column=Integer.parseInt(inputArr[1]);
	int num=0;
	if((row%2)!=0){
		num=(row-1)*5+(2*(column-1));
		System.out.println(num);
	}
	else{
		int temp=(row-1)*5;
		int num1=(temp+1)+(2*(column-1));
		System.out.println(num1);
	}
	
}
	
	
}
