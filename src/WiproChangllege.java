import java.util.ArrayList;
public class WiproChangllege {
	public static void main(String arg[]){
		int a[]={2,30,15,10,8,5,80};
//		int a[]={2,5,3,4,1,9,10,5,100};
//		int a[]={11,10,9,8,7,15,50,49,55,56,53,300};
		int resu=maximumPositiveFrequency(a,a.length);
		System.out.println(resu);
	}

	 public static int maximumPositiveFrequency(int[] input1,int input2)
	    {
		 int maxPositiveFreq=0;
		 int minElement=0,currMaxFreq=0,firstDiff=0,secondDiff=0;
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 for(int i=0;i<input2-1;i++){
			 if(input1[i+1]>input1[i]){
				 minElement=input1[i];
				 while((i+1)!=input2){
					 if(input1[i+1]>input1[i])
					 i++;
					 else
						 break;
				 }
				 currMaxFreq=(input1[i]-minElement);
				 if(arr.size()==2){
					 if(((arr.get(0)<currMaxFreq)||(arr.get(1)<currMaxFreq))){
					 firstDiff=currMaxFreq-arr.get(0);
					 secondDiff=currMaxFreq-arr.get(1);
					 if(firstDiff>secondDiff){
						 maxPositiveFreq-=arr.get(0);
						 arr.set(0,currMaxFreq);
						 maxPositiveFreq+=currMaxFreq;
					 }
					 else{
						 maxPositiveFreq-=arr.get(1);
						 arr.set(1,currMaxFreq);
						 maxPositiveFreq+=currMaxFreq;
					 }
					 }
				 }
				 else{
					 maxPositiveFreq+=currMaxFreq;
					 arr.add(currMaxFreq);
				 }
			 }
		 }
	       return maxPositiveFreq;
	    }
	
}
