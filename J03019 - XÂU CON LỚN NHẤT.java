import java.util.*;
import java.math.*;

public class Main {
    static class pi {
        char c;
        int index;

        public pi(char x, int y) {
            c = x;
            index = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<pi> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            a.add(new pi(s.charAt(i), i));
        a.sort((pi x, pi y) -> {
            return (int) (y.c - x.c);
        });
        int pre = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).index < pre)
                continue;
            System.out.print(a.get(i).c);
            pre = a.get(i).index;
        }
    }
}
