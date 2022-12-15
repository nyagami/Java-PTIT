import java.util.*;
import java.io.*;

public class non {

    static class pair {
        String s;
        int cnt;

        public pair(String s) {
            this.s = s;
            cnt = 1;
        }

        @Override
        public String toString() {
            return s + " " + cnt;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> lines = (ArrayList<String>) o.readObject();
        HashMap<String, pair> hm = new HashMap<>();
        ArrayList<pair> a = new ArrayList<>();
        for (String line : lines) {
            if (line.length() == 0)
                continue;
            String[] arr = line.toLowerCase().trim().split("[^a-z0-9]");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 0) {
                    if (hm.get(arr[i]) == null) {
                        pair x = new pair(arr[i]);
                        hm.put(arr[i], x);
                        a.add(x);
                    } else
                        hm.get(arr[i]).cnt++;
                }
            }
        }
        a.sort((pair x, pair y) -> {
            if (x.cnt == y.cnt)
                return x.s.compareTo(y.s);
            return y.cnt - x.cnt;
        });
        a.forEach(e -> System.out.println(e));
    }
}
