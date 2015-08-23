
public class Multples3and5 {

	public static void main(String args[]){
		
		boolean is3Cross=true,is5Cross=true;
		int i=1,num3=0,num5=0;
		int sum=0;
		while(is3Cross||is5Cross){
			num3=(3*i);
			num5=(5*i);
			System.out.println("multipleOf3:"+num3+"---MulitpleOf5:"+num5);
			
			if((num3%3==0)&&(num5%5)==0){
				sum=sum+num3;
			}
			else{
			if(num3<1000){
				sum=sum+num3;
			}else{
				is3Cross=false;
			}
			if(num5<1000){
				sum=sum+num5;
			}else{
				is5Cross=false;
			}
			}
			System.out.println("Sum:"+sum);
			i++;
		}
		System.out.println("i:"+i);
		System.out.println(sum);
		
	}
	
	
	
}
