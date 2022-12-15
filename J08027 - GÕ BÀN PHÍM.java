import java.util.*;

public class non {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                if (!a.empty())
                    b.push(a.pop());
            } else if (s.charAt(i) == '>') {
                if (!b.empty())
                    a.push(b.pop());
            } else if (s.charAt(i) == '-') {
                if (!a.empty())
                    a.pop();
            } else
                a.push(s.charAt(i));
        }
        while (!a.empty())
            b.push(a.pop());
        while (!b.empty())
            System.out.print(b.pop());
    }
}
