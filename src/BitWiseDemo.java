
public class BitWiseDemo {

	public static void main(String[] arg){
		char a[]={'a','b','c'};
		ps(a,a.length);
		
		
	}
	
	
	public static void ps(char[] a,int n){
		System.out.println(1<<n);
		for(int i=0;i<(1<<n);++i){
			System.out.println();
			for(int j=0;j<n;++j){
				int b=i & (1<<j);
				if(b>=1)
					System.out.print(a[j]);
			
			}
		}
		
		
	}
	
	
}

/*
void possibleSubsets(char A[], int N)
{
    for(int i = 0;i < (1 << N); ++i)
    {
        for(int j = 0;j < N;++j)
            if(i & (1 << j))
                cout << A[j] << ‘ ‘;
        cout << endl;
}
}
*/


/*
long largest_power(long N)
{
    //changing all left side bits to 1.
    N = N| (N>>1);
    N = N| (N>>2);
    N = N| (N>>4);
    N = N| (N>>8);

//as now the number is 2 * x-1, where x is required answer, so adding 1 and dividing it by
 2. 
            return (N+1)>>1;

}*/


/*
bool check (int N)
{
    if( N & (1 << i) )
        return true;
    else
        return false;
}*/



/*
int count_one (int n)
{
    while( n )
    {
    n = n&(n-1);
       count++;
    }
    return count;
}*/

/*
bool isPowerOfTwo(int x)
{
    // x will check if x == 0 and !(x & (x - 1)) will check if x is a power of 2 or not
    return (x && !(x & (x - 1)));
}
*/