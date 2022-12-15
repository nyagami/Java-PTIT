import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> dp = new ArrayList<>();
    static void Try(int i, int n, String s){
        dp.add(Integer.parseInt(s));
        if(i==n) return;
        Try(i+1,n,s+"0");
        Try(i+1,n,s+"9");
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Try(0, 8, "9");
        Collections.sort(dp);
        while(t-->0){
            int n = sc.nextInt();
            for(int i=0;i<dp.size();i++){
                if(dp.get(i) % n ==0){
                    System.out.println(dp.get(i));
                    break;
                }
            }
        }
    }
}
