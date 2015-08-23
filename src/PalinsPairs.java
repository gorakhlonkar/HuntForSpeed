import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PalinsPairs {
	public static void main(String[] arg) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T =Integer.parseInt(br.readLine());
		String str[]=new String[T];
		int i=0;
		while(i<T){
			str[i]=br.readLine();
			i++;
		}
		int count=0;
		for(i=0;i<T;i++){
			for(int j=i+1;j<T;j++){
				if(str[i].equals(new StringBuffer(str[j]).reverse().toString())){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
