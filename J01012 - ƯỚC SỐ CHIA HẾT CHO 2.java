
import java.util.Scanner;
public class Main {

    static int count(int n){
        if(n%2==1) return 0;
        int can=(int) Math.sqrt((double) n);
        int c=0;
        for(int i=1;i<=can;i++){
            if(n%i==0){
                if(i%2==0) c++;
                if((n/i)%2==0) c++;
            }
        }
        if(can*can==n && can%2==0) c--;
        return c;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        for (int i = 0; i < t; i++) {
            int a=reader.nextInt();
            System.out.println(count(a));
        }
        reader.close();
    }
}
