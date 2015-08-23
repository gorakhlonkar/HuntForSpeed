import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
 
class Discount{
public static void main(String[] arg) throws java.lang.Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int T=Integer.parseInt(br.readLine());
Double q,p;
while(T>0){
String input[]=br.readLine().split("\\s+");
q=Double.parseDouble(input[0]);
p=Double.parseDouble(input[1]);
if(q>1000){
System.out.println(round(((q*p)-(((q*p)*0.1)))));
}else{
System.out.println(q*p);
}
T--;
}
}

public static double round(double val){
	DecimalFormat df=new DecimalFormat(".######");
	return Double.valueOf(df.format(val));
}
} 