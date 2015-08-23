import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookMyshow {
	public static void main(String[] arg) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int noofInputs=Integer.parseInt(br.readLine());
		for(int noOfinputIndex=0;noOfinputIndex<noofInputs;noOfinputIndex++){
			String input=br.readLine();
			String []inputArrNM=input.split("\\s");
			int N=Integer.parseInt(inputArrNM[0]);
			int M=Integer.parseInt(inputArrNM[1]);
			for(int j=0;j<N;j++){
				Double lessDiscount=1001.00;
				int lessIndex=0;
				for(int k=0;k<M;k++){
					String discount=br.readLine();
					String discoutarr[]=discount.split("\\s");
					Double firstDiscount=1000*(Integer.parseInt(discoutarr[0])*(0.01));
					Double val1=1000-firstDiscount;
					Double secondDiscount=val1*((Integer.parseInt(discoutarr[1]))*(0.01));
					Double val2=val1-secondDiscount;
					Double thirdDiscount=val2*((Integer.parseInt(discoutarr[2]))*(0.01));
					Double val3=val2-thirdDiscount;
					if(val3<lessDiscount){
						lessDiscount=thirdDiscount;
						lessIndex=k;
					}
				}
				System.out.print(lessIndex+1+" ");
			}
			System.out.println();
		}
	}
}
