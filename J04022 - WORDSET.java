import java.util.*;

public class Main {
    static class WordSet {
        TreeSet<String> a;

        public WordSet(String s) {
            a = new TreeSet<>();
            String[] r = s.toLowerCase().trim().split("\\s+");
            for (int i = 0; i < r.length; i++)
                a.add(r[i]);
        }

        public WordSet() {
            a = new TreeSet<>();
        }

        public WordSet union(WordSet b) {
            WordSet c = new WordSet();
            c.a.addAll(this.a);
            c.a.addAll(b.a);
            return c;
        }

        public WordSet intersection(WordSet b) {
            WordSet c = new WordSet();
            for (String i : this.a) {
                for (String j : b.a) {
                    if (i.compareTo(j) == 0)
                        c.a.add(i);
                }
            }
            return c;
        }
        @Override
        public String toString() {
            String r = "";
            for (String i : a)
                r += i + ' ';
            return r;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main5905074(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

