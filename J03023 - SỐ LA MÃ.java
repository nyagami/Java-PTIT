import java.util.*;

public class Main {
    static HashMap<Character, Integer> a = new HashMap<>();
    static String LM = "MDCLXVI";

    static int cal(String s) {
        for (int i = 0; i < LM.length(); i++) {
            if (s.indexOf(LM.charAt(i)) > -1) {
                int x = s.indexOf(LM.charAt(i));
                return a.get(LM.charAt(i)) - cal(s.substring(0, x)) + cal(s.substring(x + 1));
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a.put('I', 1);
        a.put('V', 5);
        a.put('X', 10);
        a.put('L', 50);
        a.put('C', 100);
        a.put('D', 500);
        a.put('M', 1000);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(cal(sc.next()));
        }
    }
}
