import java.io.BufferedReader;
import java.io.InputStreamReader;


class SmallestPair {
	public static void main(String[] arg) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T>0){
		int len=Integer.parseInt(br.readLine());
		String[] input=br.readLine().split("\\s");
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=Integer.parseInt(input[i]);
			
		sort(arr,0,len-1);
		if(len>=2)
		System.out.println(arr[0]+arr[1]);
		else
			System.out.println(arr[0]);
			T--;
		}
		}
	
	public static void sort(int arr[],int i,int j){
		int min=i;
		int max=j;
		int pivot=arr[((min+max)/2)];
		while(i<=j){
			while(arr[i]<pivot)
				i++;
			
			while(arr[j]>pivot)
				j--;
			
			if(i<=j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
		}
		
		if(min<j)
			sort(arr,min,j);
		if(i<max)
			sort(arr,i,max);
	}
	
}
