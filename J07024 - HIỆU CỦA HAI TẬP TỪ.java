import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    static class WordSet {
        TreeSet<String> a;

        public WordSet(String filename) throws IOException {
            Scanner sc = new Scanner(new File(filename));
            String s = "";
            while (sc.hasNextLine())
                s += sc.nextLine() + " ";
            a = new TreeSet<>();
            String[] r = s.toLowerCase().trim().split("\\s+");
            for (int i = 0; i < r.length; i++)
                a.add(r[i]);
        }

        public WordSet() {
            a = new TreeSet<>();
        }

        public WordSet difference(WordSet b) {
            WordSet r = new WordSet();
            a.forEach(e -> {
                if (!b.a.contains(e))
                    r.a.add(e);
            });
            return r;
        }

        @Override
        public String toString() {
            return String.join(" ", a);
        }
    }

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
    public static void main1951045(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

