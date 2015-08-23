
public class Matrix {

	public static void main(String args[]){
		int a[][]={{1,2,3,12},{4,5,6,14},{7,8,9,16},{7,8,9,16}};
		int b[][]=a;
		a=b;
		int al=a.length-2;
		int bl=b.length-1;
		System.out.println(al+" "+bl);
		int curr1=0;
		for(int i=0;i<=al+1;i++){
			int curr=i;
			int val=a[al][i];
			for(int k=0;k<al+1;k++){
				curr1=al-2;
				int val2=a[al-1][k];
			for(int j=0;j<=al+1;j++){
				int val3=a[al-2][j];
				System.out.println(" "+val +" "+val2 +" "+val3);
			}
			}
			
		}
	}
	
	public static void fun(int a[][],int i,int j,int m,int n){
     		
		
		
	}
	
}