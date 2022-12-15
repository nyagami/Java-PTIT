import java.util.*;
import java.io.*;

public class Main{
    static boolean check(Integer x){
        String s = x.toString();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        if(s.length() % 2 == 1 && s.length() > 1){
            for(int i=0; i<s.length(); i++){
                int u = s.charAt(i) - '0';
                if(u%2==0) return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] arg)throws IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) o2.readObject();
        HashMap<Integer, Integer> h1 = new HashMap<>();
        HashMap<Integer, Integer> h2 = new HashMap<>();
        a1.forEach(e -> {
            if(check(e)){
                if(h1.get(e) == null) h1.put(e, 1);
                else h1.put(e, h1.get(e)+1);
            }
        });
        a2.forEach(e -> {
            if(check(e)){
                if(h2.get(e) == null) h2.put(e, 1);
                else h2.put(e, h2.get(e)+1);
            }
        });
        TreeMap<Integer, Integer> ans = new TreeMap<>();
        h1.forEach((k,v) -> {
            if(h2.get(k) != null) ans.put(k, v + h2.get(k));
        });
        for(int i=0;i<10;i++){
            if(ans.isEmpty()) break;
            System.out.println(ans.firstKey() + " " + ans.get(ans.firstKey()));
            ans.remove(ans.firstKey());
        }
    }
}
