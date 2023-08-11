public class Main
{
    public static void main(String[] args) {
       String n="10001";
       binToDec(n);
    }
    public static void binToDec(String n){
        int m=0;
        int k=1;
        for(int i=n.length()-1;i>=0;i--){
            m= m+(n.charAt(i)-'0')*k;
            k=k*2;
        }
        System.out.print(m);
    }
}
