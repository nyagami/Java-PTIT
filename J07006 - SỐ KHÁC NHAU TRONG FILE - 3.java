import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("DATA.in"));
        TreeMap<Integer, Integer> a = new TreeMap<>();
        ArrayList<Integer> l = (ArrayList<Integer>) is.readObject();
        l.forEach( x -> {
            if(a.get(x) == null) a.put(x, 1);
            else a.put(x, a.get(x)+1);
        });
        a.forEach((k,v) -> {
            System.out.printf("%d %d\n", k , v);
        });
    }
}
