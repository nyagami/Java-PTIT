import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main{
    static char up(char x){
        if('a'<=x && x<='z') return (char)((int)x-32);
        return x;
    }
    static Queue<String> re(String name){
        String[] a = name.split("[' ']+");
        Queue<String> r = new ArrayDeque<>();
    
        for(int i=0; i<a.length; i++){
            if(a[i].length() == 0) continue;
            String s = Character.toString(up(a[i].charAt(0))) + a[i].substring(1);
            r.add(s);
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            if(name.length() == 0) continue;
            Queue<String> q = re(name.toLowerCase());
            String[] a = new String[q.size()];
            q.toArray(a);
            a[a.length-1] += ",";
            for(int i=1; i<a.length; i++) System.out.printf("%s ",a[i]);
            System.out.println(a[0].toUpperCase());
        }
    }
}
