import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ke = new int[n+1];
        for(int i=0;i<n-1;i++){
            int x = sc.nextInt(), y = sc.nextInt();
            ke[x]++;
            ke[y]++;
        }
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(ke[i]>1) cnt++;
        }
        if(cnt>1) System.out.println("No");
        else System.out.println("Yes");
    }
}
