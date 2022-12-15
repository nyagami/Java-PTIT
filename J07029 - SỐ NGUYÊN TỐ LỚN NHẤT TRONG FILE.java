import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        boolean[] f = new boolean[1000005];
        for(int i=2; i<f.length; i++) f[i]=true;
        for(int i=2; i<=(int)Math.sqrt(f.length); i++){
            if(f[i]){
                for(int u=i; u<=1000000/i; u++) f[i*u]=false;
            }
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        a.forEach(e ->{
            if(f[e]){
                if(hm.get(e) == null) hm.put(e, 1);
                else hm.put(e, hm.get(e)+1);
            }
        });
        for(int i=0; i<10; i++){
            int k = hm.lastKey();
            System.out.println(k + " " + hm.get(k));
            hm.remove(k);
        }
    }
}
