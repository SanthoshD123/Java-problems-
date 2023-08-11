public class Main
{
    public static void main(String[] args) {
        String txt = "geeks for geeks";
        String pat = "geeks";       //pattern
        patSearch(txt,pat);
    }
    public static void patSearch(String txt,String pat){
        int pos = txt.indexOf(pat);
        while(pos>=0){
            System.out.print(pos+" ");
            pos = txt.indexOf(pat,pos+1);
        }
    }
}
