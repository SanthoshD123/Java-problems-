public class Main
{
    public static void main(String[] args) {
       int n=6;
       decToBin(n);
    }
    public static void decToBin(int n){
        String s = " ";
        while(n>0){
            s = (n%2)+s;
            n= n/2;            
        }
        System.out.print(s);
    }
}
