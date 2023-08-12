public class Main
{
	public static void main(String[] args) {
	    int n = 5;
		int a = 1;
		int b = 1;
		for(int i=1;i<=n;i++){
		    int c = a+b;
		    System.out.print(c+" ");
		    a = b;
		    b = c;
		}
	}
}
