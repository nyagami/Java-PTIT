import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        boolean[] f = new boolean[1000005];
        for(int i=2; i<f.length; i++) f[i]=true;
        for(int i=2; i<=(int)Math.sqrt(f.length); i++){
            if(f[i]){
                for(int u=i; u<=1000003/i; u++) f[i*u]=false;
            }
        }
        final int n = 1000000;
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) o2.readObject();
        TreeSet<Integer> t = new TreeSet<>(a1);
        t.forEach(e1 -> {
            int e2 = n - e1;
            if(e2 > e1 && f[e1] && f[e2] && a1.contains(e2) && !a2.contains(e1) && !a2.contains(e2)){
                System.out.println(e1 + " " + e2);
            }
        });
    }
}
