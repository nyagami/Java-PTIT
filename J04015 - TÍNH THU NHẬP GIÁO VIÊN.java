import java.util.*;
public class Main{
    static int sup(String s){
        if("HT".compareTo(s) == 0) return 2000000;
        if("HP".compareTo(s) == 0) return 900000;
        return 500000;
    }
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        String code = sc.nextLine(); 

        System.out.printf("%s %s %d %d %d", code, sc.nextLine(), Integer.parseInt(code.substring(2)), sup(code.substring(0,2)),
        sup(code.substring(0,2)) + sc.nextInt() * Integer.parseInt(code.substring(2)));
    }
}
