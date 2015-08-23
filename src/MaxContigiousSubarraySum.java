public class MaxContigiousSubarraySum {
	public static void main(String[] arg) throws java.lang.Exception{
		int a[]={-2,-3,4,-1,-2,1,5,-3};
		int maxSum=-32767,currSum=0,startIndex=0,StopIndex=0;
		for(int i=0;i<a.length;i++)
		{
			currSum=currSum+a[i];
			if(currSum>maxSum){
				maxSum=currSum;
				StopIndex=i;
			}
			if(currSum<0){
				currSum=0;
				startIndex=startIndex+1;
			}
		}
		System.out.println(maxSum+""+startIndex+""+StopIndex);
	}
}
