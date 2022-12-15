import java.io.*;
import java.util.*;

public class Main {

    static boolean prime(int x){
        if(x<2) return false;
        if(x==2) return true;
        if(x%2==0) return false;
        for(int i=3;i <= (int)(Math.sqrt(x));i+=2){
            if(x%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) o2.readObject();
        TreeMap<Integer,Integer> h1 = new TreeMap<>();
        TreeMap<Integer,Integer> h2 = new TreeMap<>();
        a1.forEach(e -> {
            if(prime(e)){
                if(h1.get(e) == null) h1.put(e, 1);
                else h1.put(e, h1.get(e)+1);
            }
        });
        a2.forEach(e -> {
            if(prime(e)){
                if(h2.get(e) == null) h2.put(e, 1);
                else h2.put(e, h2.get(e)+1);
            }
        });
        h1.forEach((k, v) -> {
            if(h2.get(k) != null){
                System.out.printf("%d %d %d\n", k, v, h2.get(k));
            }
        });
    }
}

