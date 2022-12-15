import java.util.*;

public class Main {
    
    static class word {
        String w;
        int cnt, stt;

        public word(String w, int i) {
            this.w = w;
            this.cnt = 1;
            this.stt = i;
        }

        @Override
        public String toString() {
            return w + " " + cnt;
        }
    }

    static boolean tn(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<word> a = new ArrayList<>();
        int index = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            if (!tn(s))
                continue;
            boolean oke = true;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).w.compareTo(s) == 0) {
                    oke = false;
                    a.get(i).cnt += 1;
                }
            }
            if (oke) {
                a.add(new word(s, index));
                index++;
            }
        }
        a.sort((word x, word y) -> {
            if (x.w.length() == y.w.length()) {
                return x.stt - y.stt;
            }
            return y.w.length() - x.w.length();
        });
        a.forEach(e -> {
            if (e.w.length() == a.get(0).w.length())
                System.out.println(e);
        });
    }
}
