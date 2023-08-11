public class Main
{
	public static void main(String[] args) {
		String a = "geeks";
		String b = " ";
		int ptr = a.length()-1;
		while(ptr>=0){
		    b = b+a.charAt(ptr);
		    ptr--;
		}
		System.out.print(b);
	}
}
