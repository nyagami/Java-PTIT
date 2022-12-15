
import java.util.Scanner;
public class Main {

    static long[] f = new long[2000001];
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.next();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='4' || s.charAt(i)=='7') c++;
        }
        System.out.print((c==4 || c==7)?"YES":"NO");
        reader.close();
    }
}
