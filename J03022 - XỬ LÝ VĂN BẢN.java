import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine())
            s += sc.nextLine();
        String[] a = s.trim().toLowerCase().split("[.?!]");
        for (String i : a) {
            i = i.trim();
            i = Character.toString(i.charAt(0)).toUpperCase() + i.substring(1);
            for (String j : i.split("\\s+"))
                System.out.printf("%s ", j);
            System.out.println("");
        }
    }
}
