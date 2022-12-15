import java.util.*;

public class Main {
    static String toD(String s) {
        String[] d = s.split("/");
        for (int i = 0; i <= 1; i++) {
            while (d[i].length() < 2)
                d[i] = "0" + d[i];
        }
        return d[0] + "/" + d[1] + "/" + d[2];
    }

    static String stdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (int i = 0; i < n.length; i++) {
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }

    static String msv(int i) {
        String s = Integer.toString(i);
        while (s.length() < 3)
            s = "0" + s;
        return "B20DCCN" + s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            System.out.printf("%s %s%s %s %.2f\n", msv(i), stdName(
                    sc.nextLine()), sc.nextLine(), toD(sc.next()), sc.nextFloat());
        }
    }
}
