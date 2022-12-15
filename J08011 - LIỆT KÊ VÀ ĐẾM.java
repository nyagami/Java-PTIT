import java.util.*;

public class non {
    static boolean check(String a) {
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) < a.charAt(i - 1))
                return false;
        }
        return true;
    }

    static class num {
        String num;
        int cnt, stt;

        public num(String num, int cnt, int stt) {
            this.num = num;
            this.cnt = cnt;
            this.stt = stt;
        }

        @Override 
        public String toString() {
            return num + " " + cnt;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, num> hm = new HashMap<>();
        ArrayList<num> a = new ArrayList<>();
        int i = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            if (!check(s))
                continue;
            if (hm.get(s) == null) {
                num x = new num(s, 1, i);
                hm.put(s, x);
                a.add(x);
            } else
                hm.get(s).cnt += 1;
        }
        a.sort((num x, num y) -> {
            if (x.cnt == y.cnt)
                return x.stt - y.stt;
            return y.cnt - x.cnt;
        });
        a.forEach(e -> System.out.println(e));
    }
}
