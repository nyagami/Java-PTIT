import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    static class WordSet {
        TreeSet<String> a;

        public WordSet(String filename) throws IOException {
            Scanner sc = new Scanner(new File(filename));
            String s = "";
            while(sc.hasNextLine()) s+=sc.nextLine() + " ";
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
            for(String i : this.a) c.a.add(i);
            for(String i : b.a) c.a.add(i);
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
            return String.join(" ", a);
        }
    }
    
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main1889176(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}


