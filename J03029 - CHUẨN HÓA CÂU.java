
import java.util.Scanner;
public class non {
    static String deli = ".!?";
    static void process(String s){
        if(s.length() == 0) return;
        if(deli.indexOf(s.charAt(s.length()-1)) == -1){
            s += ".";
        }
        String a[] = s.split("\\s+");
        int n = a.length;
        if(a[a.length - 1].length() == 1 && deli.contains(a[a.length - 1])){
            if(a.length>1){
                n-=1;
                a[a.length - 2] += a[a.length - 1];
            }
        }
        int i=0;
        while(i<n){
            a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            while(deli.indexOf(a[i].charAt(a[i].length()-1)) == -1){
                System.out.printf("%s ", a[i]);
                i++;
            }
            System.out.printf("%s ", a[i]);
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            process(sc.nextLine().toLowerCase().trim());
        }
    }
}
