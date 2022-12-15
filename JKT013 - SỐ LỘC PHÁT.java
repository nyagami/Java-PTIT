import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<String> dp = new ArrayList<>();
    static void Try(int i, int n, String s){
        if(!s.isEmpty()) dp.add(s);
        if(i==n) return;
        Try(i+1,n,s+"6");
        Try(i+1,n,s+"8");
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Try(0, 15, "");
        Collections.sort(dp, new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                if(a.length() == b.length()) return a.compareTo(b);
                return a.length() - b.length();
            }
        });
        while(t-->0){
            int n=sc.nextInt();
            int cnt=0;
            for(int i=0;i<dp.size();i++){
                if(dp.get(i).length()<=n) cnt++;
                else break;
            }
            System.out.println(cnt);
            for(int i=cnt-1;i>=0;i--){
                if(dp.get(i).length()<=n) System.out.printf("%s ",dp.get(i));
            }
            System.out.println();
        }
    }
}
