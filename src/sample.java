class x{
	public int num;
}
public class sample {
	public static void main(String[] arg){
		int i=0;
		x xon=new x();
		new sample().doi(i, xon);
		System.out.println(i+"  "+xon.num);
	}
	
	public void doi(int i,x obj){
		i=5;
		obj.num=8;
	}
	
	
}
