import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++) b[i] = a[i] = sc.nextInt();
            Arrays.sort(a);
            for(int i=0;i<n;i++){
                if(b[i] == a[0]){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
