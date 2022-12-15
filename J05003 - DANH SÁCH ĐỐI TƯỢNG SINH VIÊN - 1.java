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
            System.out.printf("%s %s %s %s %.2f\n", msv(i), sc.nextLine(), sc.nextLine(), toD(sc.next()), sc.nextFloat());
        }
    }
}
