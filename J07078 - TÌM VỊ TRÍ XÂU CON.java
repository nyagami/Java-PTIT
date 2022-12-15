import java.io.*;
import java.util.*;

public class non {

    static boolean sub(String a, String b, int l, int r) {
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i + l) != b.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            for (int i = 0; i <= s1.length() - s2.length(); i++) {
                if (sub(s1, s2, i, i + s2.length() - 1))
                    System.out.printf("%d ", i + 1);
            }
            System.out.println();
        }
    }
}
