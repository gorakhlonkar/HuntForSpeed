import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CodeMonkDemo {
	public static void main(String[] arg) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T>0){
			int no=Integer.parseInt(br.readLine());
			printNumbers(no);
			System.out.println();
		}
	}
	public static void printNumbers(int no){
		if(no<=2){
			System.out.print("-1");
			return;
		}
		if(((no%3)==0)&&((no%5)==0)){
			int i=0;
			while(i<no){
				System.out.print("5");
				i++;
			}
			return;
		}
		if(no%3==0){
			int i=0;
			while(i<no){
			System.out.print("5");
			i++;
			}
			return;
		}
		if(no%5==0){
			int i=0;
			while(i<no){
			System.out.print("3");
			i++;
			}
			return;
		}
		int temp=no;
		int flag=0;
		while(temp>0){
			temp=temp-5;
			if((temp%3)==0){
				flag=1;
				int i=0;
				while(i<temp){
					System.out.print("5");
					i++;
				}
				int remaining=no-temp;
				i=0;
				while(i<remaining){
					System.out.print("3");
					i++;
				}
				return;
			}
		}
		if(flag==0){
			temp=no;
			while(temp>0){
				temp=temp-3;
				if((temp%5)==0){
					flag=1;
					int i=0;
					while(i<temp){
						System.out.print("3");
						i++;
					}
					int remaining=no-temp;
					i=0;
					while(i<remaining){
						System.out.print("5");
						i++;
					}
					return;
				}
			}
			if(flag==0)
				System.out.print("-1");
			return;
		}
	}
}
