
import java.util.Scanner;
public class Main {
    static char convert(char x) {
        if (x == '0')
            return '0';
        if (x == '1')
            return '1';
        if (x == '8')
            return '0';
        if (x == '9')
            return '0';
        return '2';
    }

    static String ans(char[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = convert(a[i]);
            if (a[i] == '2')
                return "INVALID";
        }
        String s = new String(a);
        s=s.replaceFirst("^0+", "");  
        if ("".equals(s)) return "INVALID";
        return s;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < t; i++) {
            String s = reader.nextLine();
            System.out.println(ans(s.toCharArray()));
        }
        reader.close();
    }
}
