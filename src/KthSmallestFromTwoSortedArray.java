
public class KthSmallestFromTwoSortedArray {
	public static void main(String arg[]){
		int a[]={1,4,7,10,13};
		int b[]={2,5,8,9,15};
		int lena=a.length;
		int lenb=b.length;
		int c[]=new int[lena+lenb];
		lena=lena-1;
		lenb=lenb-1;
		int i=0,j=0,cthindex=0;;
		while(i<=lena&&j<=lenb){
			if(a[i]<b[j]){
				c[cthindex++]=a[i];
				i++;
			}
			else{
				c[cthindex++]=b[j];
				j++;
			}
		}
		
		while(i<=lena)
			c[cthindex++]=a[i++];
		
		while(j<=lenb)
			c[cthindex++]=b[j++];
		
		for(int k:c)
			System.out.println(k);
		
	}
	
	
}
