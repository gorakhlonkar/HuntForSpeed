
public class defaultValue {
	public static void main(String[] arg) throws java.lang.Exception{
			String str="flipkart";
			char []arr=str.toCharArray();
			int i=0;
			int j=str.length()-1;
			while(i<j){
				boolean isItrue=false;
				boolean isJtrue=false;
				if(isVowel(arr[i])){
					while(!isVowel(arr[j]))
						j--;
					swap(arr, i, j);
					i++;
					j--;
					isItrue=true;
				}
				
				if(isVowel(arr[j])){
					while(!isVowel(arr[i]))
						i++;
					swap(arr, i, j);
					i++;
					j--;
					isJtrue=true;
				}
				if(isItrue==false&&isJtrue==false){
				i++;
				j--;
				}
			}
			for(char c:arr)
				System.out.print(c);
	}
	
	
	public static void  swap(char a[],int i,int j){
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	
	public static boolean isVowel(char a){
		if(a=='a'||a=='i'||a=='e'||a=='o'||a=='u'){
		return true;
	}else
		return false;
	}

}
