import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        boolean[] f = new boolean[100005];
        for(int i=2; i<f.length; i++) f[i]=true;
        for(int i=2; i<=(int)Math.sqrt(f.length); i++){
            if(f[i]){
                for(int u=i; u<=100000/i; u++) f[i*u]=false;
            }
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        a.forEach(e ->{
            if(f[e]){
                if(hm.get(e) == null) hm.put(e, 1);
                else hm.put(e, hm.get(e)+1);
            }
        });
        hm.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
