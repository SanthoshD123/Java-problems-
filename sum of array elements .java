public class Main
{
	public static void main(String[] args) {
		int []a = {10,20,30,40,50};
		sum(a);
	}
	public static void sum(int []a){
	    int s=0;
	    for(int i=0;i<a.length;i++){
	        s=s+a[i];
	    }
	    System.out.print(s);
	}
}
