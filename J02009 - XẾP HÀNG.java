import java.util.*;
import java.io.*;

public class Main {
    static class pair{
        public int first, second;
        public pair(int a, int b){
            first = a;
            second = b;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<pair> a = new ArrayList<>(); 
        for(int i=0;i<n;i++) a.add(new pair(sc.nextInt(), sc.nextInt()));
        a.sort((pair x, pair b) -> {
            return x.first - b.first;
        });
        int now = 0;
        for(int i=0;i<n;i++){
            if(a.get(i).first>=now) now=a.get(i).first+a.get(i).second;
            else now+=a.get(i).second;
        }
        System.out.println(now);
    }
}
