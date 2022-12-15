import java.util.Scanner;

public class Main {

    static boolean nt(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;   
        }
        return true;
    }
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while(t>0){
            t--;
            int n = reader.nextInt();
            if(nt(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        reader.close();
    }
}
