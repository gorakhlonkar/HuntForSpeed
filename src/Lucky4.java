import java.io.*;
class Lucky4{
public static void main(String arg[]) throws NumberFormatException, IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int no=Integer.parseInt(br.readLine());
int n,count=0;
while(no>0){
n=Integer.parseInt(br.readLine());
count=0;
while(n!=0){
if((n%10)==4)count++;
n=n/10;
}
n--;
System.out.println(count);
}
}
}
 
