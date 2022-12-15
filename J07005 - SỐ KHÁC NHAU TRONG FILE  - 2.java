import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException, FileNotFoundException {
        DataInputStream is = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> a = new TreeMap<>();
        for(int i=0;i<100000;i++){
            int x = is.readInt();
            if(a.get(x) == null) a.put(x, 1);
            else a.put(x, a.get(x)+1);
        }
        a.forEach((k,v) -> {
            System.out.printf("%d %d\n", k , v);
        });
    }
}
