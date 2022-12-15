import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Main{
    static char up(char x){
        if('a'<=x && x<='z') return (char)((int)x-32);
        return x;
    }
    static String re(String name){
        String[] a = name.split("[' ']+");
        String r = "";
        for(int i=0; i<a.length; i++){
            if(a[i].length() == 0) continue;
            String s = Character.toString(up(a[i].charAt(0))) + a[i].substring(1);
            r += s + " ";
        }
        return r;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            if(name == "") continue;
            if(name.equals("END")) break;
            System.out.println(re(name.toLowerCase()));
        }
    }
}
