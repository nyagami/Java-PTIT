
import java.util.Scanner;
public class Main {

    static String cp(int n){
        int x=(int)Math.sqrt((double)n);
        return x*x==n?"YES":"NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int s=sc.nextInt();
            System.out.println(cp(s));
        }
        sc.close();
    }
}
