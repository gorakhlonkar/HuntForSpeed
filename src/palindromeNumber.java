import java.io.BufferedReader;
import java.io.InputStreamReader;


class palindromeNumber {
	public static void main(String[] arg) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T>0){
		String input=br.readLine();
		boolean isP=isPalindrome(input);
		if(isP)
			System.out.println("wins");
		else
			System.out.println("losses");
			T--;
			
		}
		
	}
	public static boolean isPalindrome(String input){
		int checkupto=input.length()/2;
		int j=input.length()-1;
		for(int i=0;i<=checkupto;i++,j--)
			if(input.charAt(i)!=input.charAt(j))
				return false;
		
		return true;
	}
}
